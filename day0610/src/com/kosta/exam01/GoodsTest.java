package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class GoodsTest extends JFrame {
	JTextField jtf_no;
	JTextField jtf_item;
	JTextField jtf_qty;
	JTextField jtf_price;
	
	int no;
	String item;
	int qty;
	int price;
	
	//텍스트 필드의 입력값을 읽어와서 각각의 변수에 저장하는 메서드 
	public void setData() {
		 no = Integer.parseInt(jtf_no.getText());
		 item = jtf_item.getText();
		 qty = Integer.parseInt(jtf_qty.getText());
		 price = Integer.parseInt(jtf_price.getText());
	}
	
	
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	
	
	
	public void loadGoodsTest() {
		rowData.clear();
		GoodsDAO dao  = new GoodsDAO();
		ArrayList<GoodsVO> list =  dao.listGoods();
		for(GoodsVO s : list) {
			Vector<String> row = new Vector<String>();
			row.add(s.getNo()+"");
			row.add(s.getItem()+"");
			row.add(s.getSqt()+"");
			row.add(s.getPrice()+"");
			rowData.add(row);
		}
		table.updateUI();
	}
	
	
	public GoodsTest(String title) {
		super(title);
		
		colNames = new Vector<String>();
		colNames.add("상품번호");
		colNames.add("상품이름");
		colNames.add("상품수량");
		colNames.add("상품가격");
		
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		
		jtf_no = new JTextField();
		jtf_item = new JTextField();
		jtf_qty = new JTextField();
		jtf_price = new JTextField();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setLayout(new GridLayout(4, 2));
		p1.add(new JLabel("상품 번호:"));
		p1.add(jtf_no);
		p1.add(new JLabel("상품 이름:"));
		p1.add(jtf_item);
		p1.add(new JLabel("상품 수량:"));
		p1.add(jtf_qty);
		p1.add(new JLabel("상품 가격:"));
		p1.add(jtf_price);
		
		p2.setLayout(new FlowLayout());
		JButton btnAdd = new JButton("등록");
		JButton btnUpdate = new JButton("수정");
		JButton btnDelete = new JButton("삭제");
		p2.add(btnAdd);
		p2.add(btnUpdate);
		p2.add(btnDelete);
		
		JPanel p_north = new JPanel();
		p_north.setLayout(new BorderLayout());
		p_north.add(p1, BorderLayout.CENTER);
		p_north.add(p2, BorderLayout.SOUTH);
		
		add(p_north, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		
		loadGoodsTest();
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				int idx = table.getSelectedRow();
				Vector<String> row = rowData.get(idx);
				jtf_no.setText(row.get(0));
				jtf_item.setText(row.get(1));
				jtf_qty.setText(row.get(2));
				jtf_price.setText(row.get(3));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setData();
				GoodsVO g = new GoodsVO(no,item,qty,price);
				GoodsDAO dao = new GoodsDAO();
				int re = dao.updateGoods(g);
				System.out.println(g);
				if(re > 0) {
					JOptionPane.showMessageDialog(null, "상품의 정보를 수정하였습니다.");
					loadGoodsTest();
				}else {
					JOptionPane.showMessageDialog(null, "상품의 정보수정을 실패하였습니다.");
				}
			}
		});
		
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setData();
				GoodsVO g = new GoodsVO(no,item,qty,price);
				GoodsDAO dao = new GoodsDAO();
				int re = dao.deleteGoods(g.getNo());	if(re > 0) {
					JOptionPane.showMessageDialog(null, "상품의 정보를 삭제하였습니다.");
					loadGoodsTest();
				}else {
					JOptionPane.showMessageDialog(null, "상품의 정보삭제을 실패하였습니다.");
				}
			}
		});
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setData();
				GoodsVO g = new GoodsVO(no, item, qty, price);
				GoodsDAO dao= new GoodsDAO();
				int re = dao.insertGoods(g);
				loadGoodsTest();
				if(re > 0) {
					JOptionPane.showMessageDialog(null, "상품등록에 성공하였습니다.");
				}else {
					JOptionPane.showMessageDialog(null, "상품등록에 실패하였습니다.");
				}
			}
		});
	}
	
	public static void main(String[] args) {
		new GoodsTest("상품관리");
	}
}
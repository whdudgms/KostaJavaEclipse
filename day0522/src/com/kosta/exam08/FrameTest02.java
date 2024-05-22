package com.kosta.exam08;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends Frame implements MouseListener{
	// Frame + MouseListener기능을 추가할 것임
	

	public MyFrame() throws HeadlessException {
		super();
	}

	public MyFrame(String title) throws HeadlessException {
		super(title);
		setSize(400,300);
		setVisible(true);
		//마우스 일처리 담장자를 등록합니다.
		// 마우스 리스너를 등록해야지 이벤트 처리가 가능함.
		// this = 이객체 를 넣어서 this에 이벤트 처리 메서드를 활용함 
		addMouseListener(this);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭함");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 누름");
		

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 떼어짐");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 들어옴");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 나감");

	}
	
	       
}

public class FrameTest02 {
	public static void main(String[] args) {
		//MyFrame my = 
				new MyFrame("그림판");
		
		


		// 창 닫기 기능 추가
//		my.addWindowListener(new java.awt.event.WindowAdapter() {
//		  public void windowClosing(java.awt.event.WindowEvent windowEvent) {
//			  System.exit(0);
//		  }
//		});
	}
}

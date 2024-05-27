package com.kosta.exam05;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LinePanel extends Panel implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int x1,y1,x2,y2;

	public LinePanel() {
		super();
		System.out.println("LinePanel생성자 동작함 ");
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("paint 동작함 ");
		
		//사각형 그리기는 x,y,width,height를 전달해야 합니다.
		//그래서 시작점과 끝점을 통해서 width,height를 계산해요
		int x = x1;
		int y = y1;
		int width = x2 -x1,height=y2 -y1;
		
		if(x2 < x1) {
			x = x2;
			width = x1 -x2;
		}
		
		if(y2 < y1) {
			y = y2;
			height = y1 -y2;
		}
 		
	
		g.drawRect(x, y, width, height);
		//g.drawRect(x1, y1, width, height);
	}
	//패널을 만들어서 패널을 프레임이 담음.

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked123123123 동작함 ");

		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed 동작함 ");

		x1= e.getX();
		y1 = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased 동작함 ");

		x2= e.getX();
		y2 = e.getY();	
		this.repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

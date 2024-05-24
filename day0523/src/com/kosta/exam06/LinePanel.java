package com.kosta.exam06;

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
		

		g.drawLine(x1, y1, x2, y2);
	}
	//패널을 만들어서 패널을 프레임이 담음.

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked 동작함 ");

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

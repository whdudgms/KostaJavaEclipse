package com.kosta.exam06;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;


public class DrawPanel extends Panel implements MouseListener {
    LinkedList<GrapicInfo> list;
    int x1, y1, x2, y2;
    int drawType = 0;  // 0:선 1:사각형 2:원 
     
    public DrawPanel() {
        super();
        System.out.println("LinePanel 생성자 동작함");
        list = new LinkedList<GrapicInfo>();
        addMouseListener(this);
    }


    @Override
    public void paint(Graphics g) {
    	int x,y,width,height,type;
    	
    	//info에 들어 있는 drawType에 따라
    	//해당 그래픽(선,사각형,원)을 그리도록 코드를 수정.
        for (GrapicInfo k : list) {
        	type = k.getDrawType();
        	
        	if(type == 2){
        		x = k.getX1();
            	y = k.getY1();
        		width = k.getX2() - k.getX1();
            	height = k.getY2() - k.getY1();
        	if(k.getX1() > k.getX2()) {
            	x = k.getX2();
            	width = k.getX1() - k.getX2();
        	}
        	if(k.getY1() > k.getY2()) {
            	y = k.getY2();
            	height = k.getY1() - k.getY2();
        	}
            g.drawOval(x, y, width, height);
        	}else if(type == 0) {
                g.drawLine(k.getX1(), k.getY1(), k.getX2(), k.getY2());
            }else if(type == 1) {
            	x = k.getX1();
            	y = k.getY1();
            	width = k.getX2() - k.getX1();
            	height = k.getY2() - k.getY1();
            	if(k.getX1() > k.getX2()) {
                	x = k.getX2();
                	width = k.getX1() - k.getX2();
            	}
            	if(k.getY1() > k.getY2()) {
                	y = k.getY2();
                	height = k.getY1() - k.getY2();
            	}
                g.drawRect(x, y, width, height);
            }
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked 동작함");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed 동작함");
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased 동작함");
        x2 = e.getX();
        y2 = e.getY();
        list.add(new GrapicInfo(x1, y1, x2, y2,drawType));
        this.repaint(); 
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
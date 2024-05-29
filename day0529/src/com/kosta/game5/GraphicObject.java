package com.kosta.game5;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

// 미래에 만들어질 적 미사일 플레이어이 가져야할 공통적인 속성과 동작을 뽑아서
// 일반화를 시키자
public abstract class GraphicObject  {
	
	
	BufferedImage img =null;
	
	int x = 0, y = 0;
	
	
	//BufferedImage객체 생성
	public GraphicObject(String name) throws IOException {
		img = ImageIO.read(new File(name));
	}
	
	public abstract void update() ;
	
	public void draw(Graphics g) {
		g.drawImage(img,x,y, null);
	}
	public  void keyPressed(KeyEvent event) {};
	//미래에 만들어질 후손 클래스들이 가져야할 공통적인 메소드를 만들어요 

}

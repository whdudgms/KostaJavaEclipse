package com.kosta.game3;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {

	//이미지 파일을 참조하기 위한 변수르 선언해요
	BufferedImage img = null;
	
	public MyPanel() throws IOException {
		//이미지를 표현하기 위한 BufferedImage 객체를 생성합니다. 
		img = ImageIO.read(new File("player.png"));
		
		//키보드 이벤트를 등록시킨다.
		addKeyListener(this);
		
		// 패널에서 원래 키보드입력을 등록하지 않음
		// 키보드 이벤트를 등록해도 동작하지 않음.
		// 등록하려면 포커스를 찍어줘야함
		requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 100, 100,null);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
	// 37왼,  39오, 38위, 40아래, 32스페이스
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT: System.out.println("왼쪽");	break;
			case KeyEvent.VK_UP: System.out.println("위");		break;
			case KeyEvent.VK_RIGHT: System.out.println("오른쪽");	break;
			case KeyEvent.VK_DOWN: System.out.println("아래쪽");	break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}

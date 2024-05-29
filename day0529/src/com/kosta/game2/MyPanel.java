package com.kosta.game2;

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

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		// 37왼,  39오, 38위, 40아래, 32스페이스
		int code = e.getKeyCode();
		if(code == 37) {
			System.out.println("왼쪽");
		}else if(code == 39) {
			System.out.println("오른쪽");
		}else if(code == 40) {
			System.out.println("아래");
		}else if(code == 38) {
			System.out.println("위");
		}
		else if(code == 32) {
			System.out.println("스페이스바");
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}

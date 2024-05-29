package com.kosta.game5;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class Player extends GraphicObject{
	public Player(String name) throws IOException {
		super(name);
		x = 150;
		y = 350;
	}

	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT: 
			System.out.println("왼쪽");	
			x -=10;
			break;
		case KeyEvent.VK_UP:
			System.out.println("왼쪽");	

			y -=10;
			break;
		case KeyEvent.VK_RIGHT: 
			System.out.println("왼쪽");	

			x +=10;
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("왼쪽");	

			y +=10;
			break;
		}
		
	}


	@Override
	public void update() {
	}

}

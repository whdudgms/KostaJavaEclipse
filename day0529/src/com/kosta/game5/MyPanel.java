package com.kosta.game5;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JPanel;


// 그래픽 JPanel , 키보드 이벤트 KeyListener
public class MyPanel extends JPanel implements KeyListener {
	Enermy enermy;
	Player player;
	Missile missile;
	
	public MyPanel() throws IOException {
		addKeyListener(this);
		requestFocus();
		setFocusable(true);

		enermy = new Enermy("enermy.png");
		player = new Player("player.png");
		missile = new Missile("missile.png");
		
		class MyThread extends Thread{
			
			@Override
			public void run() {
				while(true) {
					enermy.update();
					player.update();
					missile.update();
					repaint();
					try {Thread.sleep(50);}
					catch (InterruptedException e) {
					}
				}
			}
		}
		Thread t= new MyThread();
		t.start();
		}
		public void paint(Graphics g) {
			super.paint(g);
			enermy.draw(g);
			player.draw(g);
			missile.draw(g);
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e);
			player.keyPressed(e);
			missile.keyPressed(e, player.x, player.y);
		}
		
		@Override
		public void keyReleased(KeyEvent age0) {}
		@Override
		public void keyTyped(KeyEvent e) {		}
}



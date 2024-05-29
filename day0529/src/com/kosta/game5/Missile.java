package com.kosta.game5;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class Missile extends GraphicObject {
	boolean launched = false;
	public Missile(String name) throws IOException {
		super(name);
		y = -200;
		//맨 처음 미사일의 위치를 시야에서 벗어난 구석에 박아 놈
	}
	@Override
	public void update() {
		if(launched) y -=7;
		if(y <-100) launched =false;
	}
	public void keyPressed(KeyEvent event, int x, int y) {
		if(event.getKeyCode() == KeyEvent.VK_SPACE) {
			launched = true;
			this.x = x;
			this.y = y;
		}
	}

}
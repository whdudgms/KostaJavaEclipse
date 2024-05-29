package com.kosta.game5;

import java.awt.event.KeyEvent;
import java.io.IOException;

public class Enermy extends GraphicObject{
	int dx = -10;
	public Enermy(String name) throws IOException {
		super(name);
		x = 500;
		y = 0;
	}
	
	
	//좌우 와따리 가따리
	public void update() {
		x+=dx;
		if(x<0) dx = +10; 
		if(x>500) dx = -10;
	}




}

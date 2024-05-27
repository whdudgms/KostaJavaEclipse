package com.kosta.exam06;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame{
	DrawPanel dp;

    public MyFrame() {
        dp = new DrawPanel();
        add(dp);
        
        //메뉴바를 생성합니다.
        MenuBar mb = new MenuBar();
        
        //주메뉴 "그리기 도구"를 만듭니다.
        Menu menu_draw = new Menu("DrawType");
        
        //부메뉴 "선","사각형:, "원"을 만들어요.
        MenuItem draw_line = new MenuItem("Line");
        MenuItem draw_rect = new MenuItem("Rect");
        MenuItem draw_oval = new MenuItem("Oval");

        // 그리기도구  > 부메뉴
        menu_draw.add(draw_line);
        menu_draw.add(draw_rect);
        menu_draw.add(draw_oval);
        
        // 그리기도구 > 메뉴바
        mb.add(menu_draw);
        this.setMenuBar(mb);
        
        setSize(400, 300);
        setVisible(true);
        
        //각각의 메뉴가 눌러졌을 때 동작하도록 일을 시킵니다.
        //메뉴 이벤트를 등록한다. 
        draw_line.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("선그리기 버튼을 눌렀어요");
				dp.drawType = 0;
			}
		});
        draw_rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("사격형그리기 버튼을 눌렀어요");
				dp.drawType = 1;
			}
		});
        draw_oval.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("원그리기 버튼을 눌렀어요");
				dp.drawType = 2;
			}
		});
        
        
    }
}







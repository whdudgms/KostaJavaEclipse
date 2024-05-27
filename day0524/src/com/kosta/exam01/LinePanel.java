package com.kosta.exam01;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.LinkedList;

// Panel은 복잡한 화면 구성을 위한 서브 컨테이너 역할을 하거나 
// 그래픽을 표현하기 위하여 사용하는 화면 구성 요소입니다.
// 아래의 LinePanel은 그래픽을 표현하기 위하여 Panel 클래스에서 상속받고
// 마우스 움직임에 대한 이벤트 처리를 위하여 MouseListener 인터페이스를 구현하도록 합니다.
public class LinePanel extends Panel implements MouseListener {

    // 화면에 그려질 선에 대한 정보를 담고 있는 리스트
    LinkedList<GrapicInfo> list;
    
    // 선을 그릴 시작점과 끝점의 좌표
    int x1, y1, x2, y2;

    // 생성자: 리스트를 초기화하고, 마우스 리스너를 등록합니다.
    public LinePanel() {
        super();
        System.out.println("LinePanel 생성자 동작함");
        list = new LinkedList<GrapicInfo>();
        addMouseListener(this); // 현재 패널인 LinePanel에 마우스 이벤트 리스너를 등록합니다.
    }

    // GUI 프로그래밍에서는 화면을 다시 그려줘야 할 필요가 있을 때
    // paint 메서드가 자동으로 호출됩니다.
    // 처음 LinePanel을 생성하여 프레임에 담으면 이 paint 메서드가 자동으로 호출되고
    // 프레임의 크기를 조절하면 그 속에 있는 패널 크기도 변경되기 때문에
    // 그때도 paint가 자동으로 호출됩니다.
    @Override
    public void paint(Graphics g) {
        System.out.println("paint 동작함");
        // 리스트에 담긴 선의 정보만큼 반복 실행하여
        // 모든 선을 그려줍니다.
        for (GrapicInfo k : list) {
            g.drawLine(k.getX1(), k.getY1(), k.getX2(), k.getY2());
            //(k.getX1(), k.getY1(), k.getX2(), k.getY2());
        }
    }

    // 마우스를 클릭했을 때 호출되는 메서드
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked 동작함");
        // 구현할 내용이 없으면 빈 메서드로 남겨둡니다.
    }

    // 마우스를 눌렀을 때 호출되는 메서드
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed 동작함");
        // 시작점 좌표를 저장합니다.
        x1 = e.getX();
        y1 = e.getY();
    }

    // 마우스를 떼었을 때 호출되는 메서드
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased 동작함");
        // 끝점 좌표를 저장하고 리스트에 추가합니다.
        x2 = e.getX();
        y2 = e.getY();
        list.add(new GrapicInfo(x1, y1, x2, y2));
        // 패널을 다시 그리도록 요청합니다.
        this.repaint(); //  repaint >> paint호출 
    }

    // 마우스가 컴포넌트에 진입했을 때 호출되는 메서드
    @Override
    public void mouseEntered(MouseEvent e) {
        // 구현할 내용이 없으면 빈 메서드로 남겨둡니다.
    }

    // 마우스가 컴포넌트를 벗어났을 때 호출되는 메서드
    @Override
    public void mouseExited(MouseEvent e) {
        // 구현할 내용이 없으면 빈 메서드로 남겨둡니다.
    }
}
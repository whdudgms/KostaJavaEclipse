package com.kosta.exam01;

import java.awt.Frame;

// MyFrame 클래스는 Frame을 상속받아 GUI 애플리케이션의 메인 윈도우 역할을 합니다.
public class MyFrame extends Frame {
    // LinePanel을 포함하여 그래픽을 그리기 위한 패널을 선언합니다.
    LinePanel lp;

    // MyFrame 생성자: 프레임을 초기화하고 LinePanel을 추가합니다.
    public MyFrame() {
        // LinePanel 인스턴스를 생성합니다.
        lp = new LinePanel();
        
        // 생성된 LinePanel을 프레임에 추가합니다.
        // add 메서드는 이 프레임의 컨테이너에 주어진 컴포넌트를 추가합니다.
        // 여기서 'this'는 현재 MyFrame 인스턴스를 가리키며, 
        // MyFrame은 Frame을 상속받기 때문에 이 프레임의 컨테이너 역할을 합니다.
        add(lp);
        
        // 프레임의 크기를 설정합니다. 너비 400, 높이 300으로 설정합니다.
        setSize(400, 300);
        
        // 프레임을 화면에 표시합니다.
        setVisible(true);
    }
}
/*
Frame과 Panel의 관계
Frame은 최상위 컨테이너로, 독립된 윈도우를 나타냅니다. 
일반적으로 애플리케이션의 메인 윈도우 역할을 하며,
제목 표시줄, 닫기 버튼, 최소화/최대화 버튼 등의 창 관리자 요소를 포함합니다.
Panel은 컨테이너 클래스의 일종으로, 복잡한 화면 구성을 위한 서브 컨테이너 역할을 합니다.
Panel은 자체적으로는 창 관리자 요소를 가지지 않으며, 
주로 다른 컨테이너(예: Frame, Applet)에 포함되어 사용됩니다.
Panel을 사용하면 여러 컴포넌트를 그룹화하여 구성할 수 있으며, 
Panel 자체도 컴포넌트이기 때문에 다른 컨테이너에 추가될 수 있습니다.
*/
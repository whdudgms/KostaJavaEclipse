package com.kosta.chat02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPChatClient extends JFrame {
	JTextArea jta;
	JTextField jtf;
	
	//맴버변수로 Soceket과 입출력을 위한 스트림을 선언한다.
	Socket socket;
	InputStream is;
	OutputStream os;
	
	
	public TCPChatClient() {
		
		try {
			//1. 서버와 통신을 요청하기 위한 소켓을 생성한다.
			socket = new Socket("172.30.1.68",9003);
			
			//2. 생성된 소켓을 통하여 입출력 스트림을 생성한다.
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			jta = new JTextArea();
			jtf = new JTextField(50);
			JScrollPane jsp = new JScrollPane(jta);
			JButton btnSend = new JButton("전송");
			JPanel p = new JPanel();
			p.setLayout(new BorderLayout());
			p.add(jtf, BorderLayout.CENTER);
			p.add(btnSend, BorderLayout.EAST);
			add(jsp, BorderLayout.CENTER);
			add(p, BorderLayout.SOUTH);
			
			setSize(400, 300);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//서버로 부터 수신된 데이터를 계속하여 받기 위한 쓰레드를 만들어요
			class ClientThread extends Thread{
				byte []data = new byte[100];
				public void run() {
					try {
						while(true) {
							is.read(data);
							jta.append(new String(data));
							jta.append("\n");
							Arrays.fill(data, (byte)0);
						}
					}catch (Exception e) {
						System.out.println("예외발생:"+e.getMessage());
					}
				}
			}
			
			ClientThread ct = new ClientThread();
			ct.start();
			
			
			//"전송"버튼에 이벤트를 연결한다.
			btnSend.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					//텍스트필드에 써진 글자를 바이트 배열로 갖고 온다.
					byte []data = jtf.getText().getBytes();					
					try {
						os.write(data);						
					}catch (Exception ex) {
						System.out.println("예외발생:"+ex.getMessage());
					}
					
				}
			});
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new TCPChatClient();
	}
}
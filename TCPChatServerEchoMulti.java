

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

class ServerThread extends Thread{
	Socket socket;
	InputStream is;
	OutputStream os;

	public ServerThread(Socket socket) {
		try {
			//연결된 클라이언트와 데이터를 주고받기 위한 입출력 스트림을 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
		}
		catch(Exception e) {
			System.out.println("예외발생"+e.getMessage());
		}
	}
	
	@Override
	public void run() {
		byte []data = new byte[100];
		try {
			while(true) {
				is.read(data);	//수신된 데이터를 
				os.write(data); //그대로 클라이언트에게 보내다. (메아리)
				String msg = new String(data);
				System.out.println("수신된 데이터==>"+msg);
				Arrays.fill(data, (byte)0);
			}
		}catch(Exception e) {
			System.out.println("예외발생"+e.getMessage());
		}
	}
}

public class TCPChatServerEchoMulti {	
	public static void main(String[] args) {
		//클라이언트로 부터 수신된 데이터를 받기 위한 배열을 만들어요
		//1. ServerSocket을 생성한다.
		try {
			ServerSocket server = new ServerSocket(9003);
			//클라이언트의 접속을 무한대기상태로 기다린다.
			while(true) {
				//클라이언트 접속을 수락한다.
				Socket socket = server.accept();
				
				//연결한 클라이언트를 상대하여 계속 통신할 쓰레드를 생성한다.
				ServerThread st = new ServerThread(socket);
				
				//쓰레드를 가동 시킨다. 
				st.start();
			}
		}catch(Exception e){
			System.out.println("예외발생:"+e.getMessage());
		}		
	}
}
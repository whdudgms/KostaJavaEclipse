package com.kosta.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class UDPReceiver {
	
	public static void main(String[] args) {
		try {
			DatagramSocket socket = new DatagramSocket(9002);
			byte[] data = new byte[100];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			while(true) {
				socket.receive(packet);
				String msg = new String(data);
				System.out.println("수신된 메세지:"+msg); 
				Arrays.fill(data,(byte)0);
				}
		} catch (SocketException e) {
			System.out.println("예외발생:"+e.getStackTrace());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

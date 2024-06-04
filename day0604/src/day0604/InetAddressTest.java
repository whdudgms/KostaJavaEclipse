package day0604;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
		try {
		InetAddress addr = Inet4Address.getByName("www.naver.com");
		System.out.println(addr);

		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		for(InetAddress addr1 : arr) {
			System.out.println(addr1);
		}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

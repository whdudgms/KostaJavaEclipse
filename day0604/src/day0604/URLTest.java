package day0604;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;

public class URLTest {
	
	public static void main(String[] args)  {
		
		byte[] data = new byte[200];
		try {
		URL url = new URL("https://www.hanbit.co.kr/store/books/new_book_list.html");
		InputStream is = url.openStream();

			String str = "";
			while(is.read(data) != -1) {
				str += new String(data);
				Arrays.fill(data, (byte)0);
			}
			System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

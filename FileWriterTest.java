
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\data/hello.txt");
		
		fw.write("hello1111 java");
		fw.close();
		System.out.println("파일을 생성하였습니다...........");
		
	}
}

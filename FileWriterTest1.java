import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {
	public static void main(String[] args) throws IOException {
		

		try{
		FileWriter fw = new FileWriter("C:\\data/hello.txt");
		fw.write("hello1111 java");
		fw.close();
		}catch(IOException e ){
			System.out.println("파일을 실패하였습니다............");
			return;
		}
		System.out.println("파일을 생성하였습니다...........");
		
	}
}

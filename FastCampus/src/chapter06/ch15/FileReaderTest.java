package chapter06.ch15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader fis = new FileReader("reader.txt")){
			//문자 단위는 FileReaderㄹ를 쓴다
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}

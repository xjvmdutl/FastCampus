package chapter06.ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			//보조 스트림 사용
			int i;
			while((i =isr.read()) != -1) {//문자로 읽으면 깨진다.
				//보조스트림 사용 해야 한다.
				System.out.print((char)i);
			}
		}catch (IOException e) {
		
		}
	}

}

package chapter06.ch13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {//클래스 이름에 숫자 들어가는것은 안좋다.
	
	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		try {
//			i = System.in.read();//읽는다.(try-catch를 해야된다)
//			//read로 읽어보면 1Byte값을 읽어오고 int형을 반환한다(character값을 int변환)
//			System.out.println(i);
//			System.out.println((char)i);
//			while((i=System.in.read()) != '\n') {
//				System.out.print((char)i);
//			}
			//한글을 쓰게 되면 깨지게 된다(1Byte씩 읽었기 떄문에) -> 한글에 맞게 2byte씩 읽어야된다.
			//InputStream으로 되어있기 때문에 1byte씩 밖에 못읽는다.
			//보조 스트림으로 감싸야 된다
			InputStreamReader irs = new InputStreamReader(System.in);//보조스트림
			//byte -> 믄자 변경 (매개변수로 다른 inputStream을 받는다)
			while((i=irs.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

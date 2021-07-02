package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");//매개변수로 file클래스,String이름을 넣을수 있다
			System.out.println((char)fis.read());//반환형은 int형이다 -> 반환값이 없을경우에는 -1을 리턴하기 떄문에 int형을 반환한다
			System.out.println((char)fis.read());//1byte씩 읽어온다
			System.out.println((char)fis.read());
		} catch (IOException e) {//FileNotFoundException은 IOException을 하위 라서 하나로 건다
			e.printStackTrace();
		}finally {
			try {
				fis.close();//자원을 반드시 닫아주어야 한다.
			} catch (IOException e1) {
				e1.printStackTrace();
			}catch (Exception e2) {//null일때 close를 못해서 처리 해줘야 된다
				//filenotfoundException은 잡았지만 nullexception이 안잡혔기 때문에 프로그램이 비정상 종료된것이다.
				//end문을 실행을 못한다.(비정상종료)
				System.out.println(e2);
			}
		}
		System.out.println("end");
	}

}

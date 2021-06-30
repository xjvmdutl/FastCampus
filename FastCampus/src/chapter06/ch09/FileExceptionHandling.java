package chapter06.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//			//파일 inputStream 생성
//			//프로그램시에 exception을 생성하라고 컴파일러가 알려준다
//			//addthrows시 에러를 던진다. 해당 클래스에서 처리안한다.
//			//단 여기서는, main문이기 때문에 에러를 던지면 vm으로 넘어가서 에러가 발생한다.
//			System.out.println("read");
//			//a.txt가 있으면 잘실행된다(프로젝트 파일밑을 읽는다)
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			//e.printStackTrace();//file이 없을때 이순간에 에러발생한것이다.
//			System.out.println(e);
//			//각각의 catch문 마다 파일을 닫아줘야 된다.(중복코드)
//			return;//return문이 있어도 fianlly문이 실행되는걸 알수 있다.
////			try {
////				fis.close();
////			} catch (IOException e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
////			}
//		}finally {//항상 불린다.
//			if(fis != null) {
//				try {
//					fis.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println("finally");//exception이 발생되어도 실행이 되는걸 알수 있다.
//		}
//		System.out.println("end");
		//java9이상 버젼부터 변화된 부분 ,복잡한 코드를 완하시켯다
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			//FileInputStream에서 AutoClosable을 구현했기 때문에 이 객체가 exception이 발생하더도 자동으로 닫아준다.
			System.out.println("read");
		} catch (FileNotFoundException e) {//파일 없을때 발생
			e.printStackTrace();
		} catch (IOException e) {//close날때 발생
			e.printStackTrace();
		} 
		System.out.println("end");
	}

}

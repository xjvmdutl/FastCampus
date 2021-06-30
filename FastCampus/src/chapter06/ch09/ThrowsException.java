package chapter06.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {//Exception상황을 만들기 위한 클래스
	public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException { 
		//throws를 하게 되면 메소드를 호출한 곳에서 에러처리하도록 미룬다는 뜻이다.
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		/*
		try {
			test.loadClass("a.txt", "java.lang.String");
			//해당 메소드를 쓰게되면 2개의 throws한 exception을 핸들링 해야된다.
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		*/
		/*
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
			//해당 에러를 한번에 핸들링도 가능하다
		}
		*/
		try {
			test.loadClass("a.txt", "java.lang.String");
			//해당 메소드를 쓰게되면 2개의 throws한 exception을 핸들링 해야된다.
		}catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(Exception e) {
			//해당 부분에서 모든 에러를 잡아도된다.
			//default Exception
			//단 맨위에 써버릴경우 모든 에러가 여기서 처리 되기 때문에 아래의 catch가 실행이 되지 않아서 에러가 난다.
		} 
		System.out.println("end");//비정상 종료 x
		
	}

}

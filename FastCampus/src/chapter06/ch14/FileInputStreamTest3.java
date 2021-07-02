package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")){
			//autoClosable을 쓰기 때문에 finally를 안해도 된다
			while((i=fis.read()) != -1) {//파일 끝까지 읽기
				System.out.print((char)i);
			}
			//문자는 핸들링이 안된다(한글x), fileReader나 inputStreamReader로 감싸야 된다
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}

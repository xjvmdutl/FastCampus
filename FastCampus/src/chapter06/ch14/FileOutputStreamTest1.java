package chapter06.ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			//파일 없으면 새로 생성하여 주고 있으면 overWrite해준다
			//2번째 매개변수에 true값을 주게 되면 overWrite하지 않고 append해준다
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
	}

}

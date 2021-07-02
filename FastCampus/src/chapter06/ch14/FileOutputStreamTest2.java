package chapter06.ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output3.txt",true);//default는 false 이지만 true 속성 주게되면 파일뒤에 추가된다
		try(fos){//자바 9부터 제공
			byte[] bs = new byte[26];
			byte data = 65;//초기화
			for(int i = 0 ; i < bs.length ; ++i) {
				bs[i] = data++;
			}
			//fos.write(bs);
			fos.write(bs,2,10);//C~10번째 데이터 까지 출력
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
	}

}

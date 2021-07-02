package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];//바이트 단위로 읽기 떄문에 10개짜리 만든다.
			//while((i = fis.read(bs)) != -1) {//i = byte 수가 된다
			while((i = fis.read(bs,1,9)) != -1) {//bs시작위치부터 len까지 bs로 읽는다
				for(int j=0;j<i;++j) {//배열만큼 읽어 오기 때문에 for문을 돌려야된다
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
				//마지막 배열에 6바이트만 읽었지만 bs에 나머지 데이터가 남아 있기 때문에 QRST 더해진다
				//bs를 전부 돌리는 것이 아니라 i을 반환값까지만 돌린다.
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

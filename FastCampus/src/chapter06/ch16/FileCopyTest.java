package chapter06.ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class FileCopyTest {

	public static void main(String[] args) throws IOException {
		long millsecond = 0;
		try(//FileInputStream fis = new FileInputStream("a.zip");
				//오래 걸리기 떄문에 Buffer로 감싼다
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				//FileOutputStream fos = new FileOutputStream("copy.zip")
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){
			//파일 2개를 읽고 쓴다
			millsecond = System.currentTimeMillis();
			
			int i;
			while((i =bis.read()) != -1) {
				//fis 파일에서 읽어서 fos에 복사한다
				bos.write(i);
			}
			
			
			millsecond = System.currentTimeMillis() - millsecond;
			//복사 시간 확인
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(millsecond + " 소요되었습니다.");
		
		//만약 예시
		
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));	
		//네트워크를 사용할떄 해당 방식으로 사용 -> 한글을 읽을수 있는 보조스트림에 buffer도 가능한 보조스트림까지 덮는다
		br.readLine();//BufferedReader에서만 제공하는 기능으로 한줄 읽는다
	}

}

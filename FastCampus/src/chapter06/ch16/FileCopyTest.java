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
				//���� �ɸ��� ������ Buffer�� ���Ѵ�
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				//FileOutputStream fos = new FileOutputStream("copy.zip")
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){
			//���� 2���� �а� ����
			millsecond = System.currentTimeMillis();
			
			int i;
			while((i =bis.read()) != -1) {
				//fis ���Ͽ��� �о fos�� �����Ѵ�
				bos.write(i);
			}
			
			
			millsecond = System.currentTimeMillis() - millsecond;
			//���� �ð� Ȯ��
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(millsecond + " �ҿ�Ǿ����ϴ�.");
		
		//���� ����
		
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));	
		//��Ʈ��ũ�� ����ҋ� �ش� ������� ��� -> �ѱ��� ������ �ִ� ������Ʈ���� buffer�� ������ ������Ʈ������ ���´�
		br.readLine();//BufferedReader������ �����ϴ� ������� ���� �д´�
	}

}

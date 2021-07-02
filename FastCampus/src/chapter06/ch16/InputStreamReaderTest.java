package chapter06.ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){
			//���� ��Ʈ�� ���
			int i;
			while((i =isr.read()) != -1) {//���ڷ� ������ ������.
				//������Ʈ�� ��� �ؾ� �Ѵ�.
				System.out.print((char)i);
			}
		}catch (IOException e) {
		
		}
	}

}

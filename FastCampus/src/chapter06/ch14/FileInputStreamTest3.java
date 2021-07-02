package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")){
			//autoClosable�� ���� ������ finally�� ���ص� �ȴ�
			while((i=fis.read()) != -1) {//���� ������ �б�
				System.out.print((char)i);
			}
			//���ڴ� �ڵ鸵�� �ȵȴ�(�ѱ�x), fileReader�� inputStreamReader�� ���ξ� �ȴ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}

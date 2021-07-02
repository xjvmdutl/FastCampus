package chapter06.ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			//���� ������ ���� �����Ͽ� �ְ� ������ overWrite���ش�
			//2��° �Ű������� true���� �ְ� �Ǹ� overWrite���� �ʰ� append���ش�
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
	}

}

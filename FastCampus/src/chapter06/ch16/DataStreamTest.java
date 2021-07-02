package chapter06.ch16;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeFloat(10);
			dos.writeUTF("Test");
			//�� ������� �� �ڷ����� �°� �о�� �ȴ�.
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)){
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			//�� ������� �� �ڷ����� �°� �о�� �ȴ�.
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

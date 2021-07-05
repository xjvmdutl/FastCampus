package chapter06.ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);//4byte
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeDouble(3.14);//8 ����Ʈ�� 4+ 8 =12
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeUTF("�ȳ��ϼ���");// UTF�� 3Byte���̶� 15byte�� String�� ������ null �����Ͱ� ���⋚���� 2byte�� ��ƾߵȴ�
		System.out.println("pos: "+ rf.getFilePointer());//���� ������ �б�
		
		rf.seek(0);
		//�б����� �ݵ�� �ʱ�ȭ�� ���־�ߵȴ�/
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}

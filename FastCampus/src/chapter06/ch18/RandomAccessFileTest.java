package chapter06.ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);//4byte
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeDouble(3.14);//8 바이트라서 4+ 8 =12
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeUTF("안녕하세요");// UTF는 3Byte씩이라 15byte에 String은 마지막 null 포인터가 들어가기떄문에 2byte더 잡아야된다
		System.out.println("pos: "+ rf.getFilePointer());//파일 포인터 읽기
		
		rf.seek(0);
		//읽기전에 반드시 초기화를 해주어야된다/
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}

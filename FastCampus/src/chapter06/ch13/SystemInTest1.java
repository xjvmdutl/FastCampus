package chapter06.ch13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {//Ŭ���� �̸��� ���� ���°��� ������.
	
	public static void main(String[] args) {
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		int i;
		try {
//			i = System.in.read();//�д´�.(try-catch�� �ؾߵȴ�)
//			//read�� �о�� 1Byte���� �о���� int���� ��ȯ�Ѵ�(character���� int��ȯ)
//			System.out.println(i);
//			System.out.println((char)i);
//			while((i=System.in.read()) != '\n') {
//				System.out.print((char)i);
//			}
			//�ѱ��� ���� �Ǹ� ������ �ȴ�(1Byte�� �о��� ������) -> �ѱۿ� �°� 2byte�� �о�ߵȴ�.
			//InputStream���� �Ǿ��ֱ� ������ 1byte�� �ۿ� ���д´�.
			//���� ��Ʈ������ ���ξ� �ȴ�
			InputStreamReader irs = new InputStreamReader(System.in);//������Ʈ��
			//byte -> ���� ���� (�Ű������� �ٸ� inputStream�� �޴´�)
			while((i=irs.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

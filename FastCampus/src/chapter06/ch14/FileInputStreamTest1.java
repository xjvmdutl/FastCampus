package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");//�Ű������� fileŬ����,String�̸��� ������ �ִ�
			System.out.println((char)fis.read());//��ȯ���� int���̴� -> ��ȯ���� ������쿡�� -1�� �����ϱ� ������ int���� ��ȯ�Ѵ�
			System.out.println((char)fis.read());//1byte�� �о�´�
			System.out.println((char)fis.read());
		} catch (IOException e) {//FileNotFoundException�� IOException�� ���� �� �ϳ��� �Ǵ�
			e.printStackTrace();
		}finally {
			try {
				fis.close();//�ڿ��� �ݵ�� �ݾ��־�� �Ѵ�.
			} catch (IOException e1) {
				e1.printStackTrace();
			}catch (Exception e2) {//null�϶� close�� ���ؼ� ó�� ����� �ȴ�
				//filenotfoundException�� ������� nullexception�� �������� ������ ���α׷��� ������ ����Ȱ��̴�.
				//end���� ������ ���Ѵ�.(����������)
				System.out.println(e2);
			}
		}
		System.out.println("end");
	}

}

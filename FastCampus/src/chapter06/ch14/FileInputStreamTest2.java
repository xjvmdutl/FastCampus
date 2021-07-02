package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];//����Ʈ ������ �б� ������ 10��¥�� �����.
			//while((i = fis.read(bs)) != -1) {//i = byte ���� �ȴ�
			while((i = fis.read(bs,1,9)) != -1) {//bs������ġ���� len���� bs�� �д´�
				for(int j=0;j<i;++j) {//�迭��ŭ �о� ���� ������ for���� �����ߵȴ�
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "����Ʈ ����");
				//������ �迭�� 6����Ʈ�� �о����� bs�� ������ �����Ͱ� ���� �ֱ� ������ QRST ��������
				//bs�� ���� ������ ���� �ƴ϶� i�� ��ȯ�������� ������.
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

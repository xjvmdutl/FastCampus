package chapter06.ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output3.txt",true);//default�� false ������ true �Ӽ� �ְԵǸ� ���ϵڿ� �߰��ȴ�
		try(fos){//�ڹ� 9���� ����
			byte[] bs = new byte[26];
			byte data = 65;//�ʱ�ȭ
			for(int i = 0 ; i < bs.length ; ++i) {
				bs[i] = data++;
			}
			//fos.write(bs);
			fos.write(bs,2,10);//C~10��° ������ ���� ���
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("end");
	}

}

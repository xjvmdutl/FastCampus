package chapter06.ch15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');//���� �ϳ� ����
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);//buf��ŭ ����.
			fw.write("�ȳ��ϼ���, �� �����׿�");//���ڿ��� ���Ͽ� ����
			fw.write(buf,1,2);//CD�� ���� buf�� 1~2���� ����.
			fw.write("65");//���ڸ� ����ҋ� ���ڿ��� ���μ� ���
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

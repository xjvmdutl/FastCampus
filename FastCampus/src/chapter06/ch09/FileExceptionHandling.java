package chapter06.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("a.txt");
//			//���� inputStream ����
//			//���α׷��ÿ� exception�� �����϶�� �����Ϸ��� �˷��ش�
//			//addthrows�� ������ ������. �ش� Ŭ�������� ó�����Ѵ�.
//			//�� ���⼭��, main���̱� ������ ������ ������ vm���� �Ѿ�� ������ �߻��Ѵ�.
//			System.out.println("read");
//			//a.txt�� ������ �߽���ȴ�(������Ʈ ���Ϲ��� �д´�)
//			try {
//				fis.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			//e.printStackTrace();//file�� ������ �̼����� �����߻��Ѱ��̴�.
//			System.out.println(e);
//			//������ catch�� ���� ������ �ݾ���� �ȴ�.(�ߺ��ڵ�)
//			return;//return���� �־ fianlly���� ����Ǵ°� �˼� �ִ�.
////			try {
////				fis.close();
////			} catch (IOException e1) {
////				// TODO Auto-generated catch block
////				e1.printStackTrace();
////			}
//		}finally {//�׻� �Ҹ���.
//			if(fis != null) {
//				try {
//					fis.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println("finally");//exception�� �߻��Ǿ ������ �Ǵ°� �˼� �ִ�.
//		}
//		System.out.println("end");
		//java9�̻� �������� ��ȭ�� �κ� ,������ �ڵ带 ���Ͻ��ִ�
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			//FileInputStream���� AutoClosable�� �����߱� ������ �� ��ü�� exception�� �߻��ϴ��� �ڵ����� �ݾ��ش�.
			System.out.println("read");
		} catch (FileNotFoundException e) {//���� ������ �߻�
			e.printStackTrace();
		} catch (IOException e) {//close���� �߻�
			e.printStackTrace();
		} 
		System.out.println("end");
	}

}

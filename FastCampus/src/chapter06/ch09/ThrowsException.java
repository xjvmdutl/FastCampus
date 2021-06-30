package chapter06.ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {//Exception��Ȳ�� ����� ���� Ŭ����
	public Class loadClass(String fileName,String className) throws FileNotFoundException, ClassNotFoundException { 
		//throws�� �ϰ� �Ǹ� �޼ҵ带 ȣ���� ������ ����ó���ϵ��� �̷�ٴ� ���̴�.
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		/*
		try {
			test.loadClass("a.txt", "java.lang.String");
			//�ش� �޼ҵ带 ���ԵǸ� 2���� throws�� exception�� �ڵ鸵 �ؾߵȴ�.
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		*/
		/*
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
			//�ش� ������ �ѹ��� �ڵ鸵�� �����ϴ�
		}
		*/
		try {
			test.loadClass("a.txt", "java.lang.String");
			//�ش� �޼ҵ带 ���ԵǸ� 2���� throws�� exception�� �ڵ鸵 �ؾߵȴ�.
		}catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(Exception e) {
			//�ش� �κп��� ��� ������ ��Ƶ��ȴ�.
			//default Exception
			//�� ������ �������� ��� ������ ���⼭ ó�� �Ǳ� ������ �Ʒ��� catch�� ������ ���� �ʾƼ� ������ ����.
		} 
		System.out.println("end");//������ ���� x
		
	}

}

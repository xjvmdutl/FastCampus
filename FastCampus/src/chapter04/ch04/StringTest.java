package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");//Ŭ������ ������ ������ �߱� ������ �������� �ִ�.
		Constructor[] cons = c.getConstructors();//�����ڵ��� ������ �´�
		for(Constructor co : cons) {
			System.out.println(co);
		}
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
		//�̷��� ����ϴ� ���� ���÷��� ���α׷��� �Ҷ�.
		
	}

}

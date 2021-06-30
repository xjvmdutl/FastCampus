package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("ch04.Person");//Ŭ���� ������ ����
		//�ν��Ͻ� ����
		Person person = (Person)c1.newInstance();//�� ������ �޼ҵ�..//��ȯ���� Object�� ����ȯ
	    // Ŭ������ �ν��Ͻ� ����
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();//Object�� �Լ�(��� Ŭ������ �������ִ�)
		//�� getClass�� �ν��Ͻ��� ���� ������ �Ǿ� �־�� �Ѵ�.
		Person p = (Person)c2.newInstance();
		//default constructor�� �ҷ� w�ش�.
		System.out.println(p);
		
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);//�Ķ���� Ÿ���� �ʿ��ϴ�
		
		Object[] initargs = {"kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		//local�� Persong�� ������ ����Ѵ�.//���� �޸� ������ �ٸ���..
		Person kim2 = new Person("kim");//�̰ſ� ����.
	}

}

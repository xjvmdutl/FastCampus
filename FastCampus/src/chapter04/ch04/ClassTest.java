package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("ch04.Person");//클래스 가지고 오기
		//인스턴스 생성
		Person person = (Person)c1.newInstance();//곧 삭제될 메소드..//반환형이 Object라서 형변환
	    // 클래스로 인스턴스 생성
		person.setName("Lee");
		System.out.println(person);
		
		Class c2 = person.getClass();//Object을 함수(모든 클래스를 가질수있다)
		//단 getClass는 인스턴스가 먼저 생성이 되어 있어야 한다.
		Person p = (Person)c2.newInstance();
		//default constructor를 불러 w준다.
		System.out.println(p);
		
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);//파라미터 타입이 필요하다
		
		Object[] initargs = {"kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		//local에 Persong이 없을때 사용한다.//서로 메모리 공간이 다를때..
		Person kim2 = new Person("kim");//이거와 같다.
	}

}

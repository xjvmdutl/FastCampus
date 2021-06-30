package chapter04.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");//클래스가 없으면 에러가 뜨기 때문에 문제점이 있다.
		Constructor[] cons = c.getConstructors();//생성자들을 가지고 온다
		for(Constructor co : cons) {
			System.out.println(co);
		}
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
		//이렇게 사용하는 경우는 리플랙션 프로그래밍 할때.
		
	}

}

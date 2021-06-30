package chapter04.ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);//매개변수로 String넣어줄수 있다.
		//hashCode값 확인
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);//여러개를 append할수 있다.
		System.out.println(System.identityHashCode(buffer));
		String test = buffer.toString();//String 인자로 사용
		
		System.out.println(test);
	}

}

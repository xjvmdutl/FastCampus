package chapter04.ch03;

public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java));
		java=java.concat(android);//연결은 됬다.
		System.out.println(System.identityHashCode(java));
		//두개의 주소가 다른것을 확인할수 있다.
		//
		
		System.out.println(java);
	}

}

package chapter01.ch08;

public class CharaterTest {

	public static void main(String[] args) {
		char ch1 = 'A'; //2byte를 사용한다.
		System.out.println(ch1);
		System.out.println((int)ch1);//typeCast 자료형 강제변환
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);//char타입이라 케스트 필요 없다.
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);//67에 해당되는 아스키값으로 변환되서 C가 출력
		
		//char ch = -66;//사용 불가능,음수는 쓸 수 없다.
		//char ch = -1234567;//사용 불가능,2byte이상 핸들링 할수 없어서 안된다.
		char han = '한';
		char ch = '\uD55C';// (\\u+코드값(유니코드표에 존재))
							//16비트
		System.out.println(ch);
		System.out.println(han);
	}

}

package chapter06.ch02;

public class AddTest {

	public static void main(String[] args) {
		Add addL = (x,y) ->{//해당 인터페이스를 구현한 것이다
			return x+y;//인터페이스 구현 클래스를 만들지 않고 바로 사용했다
		};
		System.out.println(addL.add(2, 3));//호출
		Add addR = (x,y) -> x+y;
		//리턴문이 하나이기 때문에 중괄호를 생략할수 있다(매개변수는 2개라 생략 불가능)
	}

}

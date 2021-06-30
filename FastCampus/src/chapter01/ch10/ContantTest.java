package chapter01.ch10;

public class ContantTest {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;//초기화 안했다.
		MIN_NUM = 0;
		//MAX_NUM = 20;//변경 불가능
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);//오류 선언은 했지만 값 지정을 안했다
		
	}

}

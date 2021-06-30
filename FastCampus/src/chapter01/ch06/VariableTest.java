package chapter01.ch06;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum = -127;//-128~127까지
		System.out.println(bnum);
		
		//int num = 12345678900;//에러 너가쓴 리터럴이 num에 들어가기 크다.
		//long lNum = 12345678900;//이거 또한 에러 리터럴이 너무 크다.
		long lNum = 12345678900L;
		//작을경우에는 자동으로 int형으로 형변환이 된다
		System.out.println(lNum);
		//연산을 대상 = 피연산자 
		//단항연산자 = 피연산자 1개 , 2항연산자 = 피연산자 2개 , 3항연산자 = 피연산자 3개(3항연산자)
	}

}

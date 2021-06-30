package chapter01.ch12;

public class LogicalTest2 {

	public static void main(String[] args) {
		int num1 =10;
		int i =2;
		
		//boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10);//false && true
		//System.out.println(value);
		//System.out.println(num1);
		//System.out.println(i);//i가 4가 나올꺼라고 예상하지만 실행 x 
		//why? 앞에 항이 이미 false 이기 때문에 실행하지 않기 때문
		
		boolean value = ((num1 = num1 + 10) > 10) || ((i = i+2) < 10);//true && false 
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);//뒤에 항 실행하지 않음
	}

}

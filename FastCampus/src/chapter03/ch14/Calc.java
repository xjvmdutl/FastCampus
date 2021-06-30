package chapter03.ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	//default메소드 구현
	//사칙연산을 하려면 해야되는 기능을 작성
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	//static 메소드 구현
	static int total(int[] arr) {//배열이 들어오면 배열을 총계산
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	//private 메소드
	private void myMethod() {//private 메소드는 재정의 할수 없다
		System.out.println("myMethod");
	}
	//static private 메소드 
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}

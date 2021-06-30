package chapter03.ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		//자바에서는 다중상속이 불가능(모호성이 발생)
		//인터페이스는 구현코드가 없기 때문에 다중구현이 가능하다.
		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc();//이인터페이스를 구현한 것이고 해당타입이다.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		//Calc에 포함된 메소드만 이용할수 있다.
		//만약 CompleteCalc형으로 선언했다면 showInfo()메소드도 호출할수 있다.
	}

}

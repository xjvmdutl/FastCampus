package chapter03.ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		
		calc.description();//디폴트 메소드 사용
		//인스턴스 생성과 별개로 사용 가능
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));//인터페이스 이름으로 바로 사용하면된다
	}

}

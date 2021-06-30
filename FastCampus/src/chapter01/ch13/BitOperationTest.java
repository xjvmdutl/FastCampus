package chapter01.ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		int num1 = 5; //00000101
		int num2 = 10;//00001010
		System.out.println(num1 | num2);//00001111 // 15
		System.out.println(num1 & num2);//00000000 // 0
		System.out.println(num1 ^ num2);//00001111 // 15
		System.out.println(~num1); //11111010 //음수가 나온다(음의 보수로 계산된값)
		
		System.out.println(num1 << 2);//00010100 //왼쪽 비트는 사라진다 
									  //20 = 5*2^2 과 같다 , 반대일경우 2^n으로 나눈값
		System.out.println(num1);//num1값 자체는 변경되지 않는다
		System.out.println(num1 <<= 2);//복합대입 연산자를 통해 num1 자체 변경가능
		System.out.println(num1);
		System.out.println(num1 >> 1);//00001010 //10 = 20/2
	}

}

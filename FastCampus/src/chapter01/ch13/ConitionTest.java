package chapter01.ch13;

import java.util.Scanner;//이 라이브러리에 있다는 것을 알려줌 

public class ConitionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//입력받는 클래스, java.util에 담겨있다
		//system.in = 표준 입력 system.out = 표준 출력
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		System.out.print("입력 1 : ");
		int num1 = sc.nextInt();//정수를 입력받는다, 입력을 기다린다.
		System.out.print("입력 2 : ");
		int num2 = sc.nextInt();
		
		max = (num1 > num2) ? num1 : num2;//num1이 num2보다 크면 max =num1 아니면 max=num2
		System.out.println(max);
	}

}

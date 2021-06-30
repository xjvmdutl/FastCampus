package chapter01.ch12;

public class LogicalTest {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =20;
		boolean flag =(num1 > 0) && (num2 > 0);//둘다 참
		System.out.println(flag);//true
		
		flag = (num1 < 0 ) && (num2 > 0);//하나 거짓 
		System.out.println(flag);//false
		
		flag = (num1 > 0 ) || (num2 > 0);//둘다 참
		System.out.println(flag);//true
		
		flag = (num1 < 0 ) || (num2 > 0);//하나 거짓
		System.out.println(flag);//true
		
		flag = !(num1 > 0 );
		System.out.println(flag);//false
	}

}

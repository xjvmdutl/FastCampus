package chapter01.ch15;

public class IfElseIfTest {

	public static void main(String[] args) {
//		int age = 17;
//		int charge;//변수만 선언하고 초기화를 안했기 때문에 에러가 난다 
//		//int charge = 3000; //이렇게 초기화 하면 문제 없다.
//		if(age < 9) {
//			charge = 1000;
//			System.out.println("미 취학 아동입니다.");
//		}else if(age < 14) {
//			charge = 2000;
//			System.out.println("초등학생입니다.");
//		}else if(age < 20) {
//			charge = 2500;
//			System.out.println("중,고등학생입니다.");
//		}else {//else문이 없어서 charge를 초기화 하지 조건에 맞지 않을경우 값을 지정을 못하기 떄문에 에러
//			//디폴트 값을 선언해 주어야된다.
//			charge = 3000;
//			System.out.println("일반인입니다.");
//		}
		
		int age = 12;
		int charge; 
		if(age < 9) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		if(age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		}
		if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		//여러개의 조건이 동시에 실행된다.
		//하나의 상황에 대해서 조건을 여러개 분기할때는 반드시 if else를 써야된다.
		//각각의 조건을 따로따로 판별할때는 if  if를 쓴다.
		
		System.out.println("입장료는 "+ charge + "입니다.");
	}
}

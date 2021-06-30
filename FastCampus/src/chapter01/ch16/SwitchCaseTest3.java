package chapter01.ch16;

import java.util.Scanner;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int day = switch(month) {//java 14 버전 이후 추가된 switch-case문
			//값을 반환 받을수 있다.
			case 1,3,5,7,8,10,12 ->{
				System.out.println("이번 달은 31일까지 입니다");
				yield 31;				// day = 31;
				//중괄호가 있을경우(문장이 2단락 이상일 경우 yield로 리턴되는값을 명시한다.
			}
			case 2 ->//문장이 한단락일경우 중괄호x, return 값만적는다
				28;				// day = 28;
			case 4,6,9,11 ->
				30; 				// day=30;

			default -> {//문장이 두개일 경우 중괄호를 쓴다
				System.out.println("존재하지 않는 달입니다.");
				yield -1;				//day = -1; 
			}
		};
		System.out.println(month + "월은 "+ day + "일 입니다.");
	}

}

package chapter01.ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ctrl + shift + o = import 단축키
		int month = sc.nextInt();//월 입력받기
		int day;
		switch(month) {//비교 대상 입력(분기 내용)
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: //같은 조건이 많을경우 하나로 합친다
				day = 31;
				break; // 쓰지 않을 경우 코드가 밑으로 흘러간다.
			case 2 : 
				day = 28;
				break;
			case 4: 
				day=30;
				break;
			case 6: 
				day=30;
				break;
			case 9: 
				day=30;
				break;
			case 11: 
				day=30;
				break;
			default : //사용 안해도 된다.
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		System.out.println(month + "월은 "+ day + "일 입니다.");
	}

}

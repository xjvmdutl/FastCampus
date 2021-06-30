package chapter01.ch16;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		String medal = "Gold";
		switch(medal) {//문자열도 바로 비교되서 사용가능
			case "Gold" :
				System.out.println("금메달 입니다.");
				break;
			case "Silver" :
				System.out.println("은메달 입니다.");
				break;
			case "Bronze" :
				System.out.println("동메달 입니다.");
				break;
			default : 
				System.out.println("메달이 없습니다.");
				break;
		}
	}

}

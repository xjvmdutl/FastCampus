package chapter01.ch20;

public class NestedLoopTest {

	public static void main(String[] args) {
		int dan = 2;
		int count = 1;
//		for(;dan <= 9; dan++) {//초기화 없으니 제거가능
//			//밖에 있는 dan 은 안에 반복이 수행되고 진행
//			for(count=1;count<=9;count++) {//하나의 단 // for문에서 초기화 했기 때문에 따로 초기화 x
//				System.out.println(dan + "x" + count + " = "+ dan*count);
//			}
//			System.out.println();
//		}
		//while로 변형
		dan = 2;//dan 초기화
		count = 1;//count 초기화
		while(dan <= 9) {
			count = 1;//count가 초기화를 안했기 때문에 내부 반복문을 수햏하지 x
			while(count <= 9) {
				System.out.println(dan + "x" + count + " = "+ dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}

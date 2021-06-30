package chapter01.ch11;

public class OperatorTest {

	public static void main(String[] args) {
		int myNum = 10;
		int yourNum = 20;
		myNum = myNum + yourNum;//이렇게도 가능하지만
		myNum += yourNum;//이렇게 더 많이 쓰임
		System.out.println(myNum);
		
		int gameScore = 150;
		//int lastScore = ++gameScore;//항에 앞쪽에 있을경우 증가 시키고 대입
		//gameScore += 1,gameScore = gamaScore +1
		int lastScore = gameScore++;
		//항에 뒤쪽에 있을경우 대입 시키고 증가 
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}

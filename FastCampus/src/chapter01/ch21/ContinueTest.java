package chapter01.ch21;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		for(num = 1 ;num<=100 ; num++) {
			if((num % 3) != 0) //3의 배수가 아니다 //연산자 우선순위 때문에 %가 먼저 실행되지만 가독성 안좋다
				continue;
			System.out.println(num);//해당 문장 출력 안한다.
		}
	}

}

package chapter01.ch17;

public class WhileTest {

	public static void main(String[] args) {//중괄호 안 변수 = 지역변수 (자동으로 초기화x)
		//1~10까지 더하기 예제 (하나의 문장을 반복되게 사용)
		int num = 1;
		int sum = 0;//더하는 결과 // 지역변수는 초기화
		while(num <=10) {
			sum += num;//sum 에러나는 이유 -초기화가 안되서 에러 
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}

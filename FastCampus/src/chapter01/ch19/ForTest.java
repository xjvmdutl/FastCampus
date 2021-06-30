package chapter01.ch19;

public class ForTest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		for(int i=0; i<10;++i,count++) {// i = 횟수, 0~9(10번)
			//문장이 하나이상 들어갈수 있다  
			sum += count;
		}
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		while(num<=10) {//1~10 까지 num이 10보다 작을때까지 실행
			total += num;
			num++;
		}
		System.out.println(total);
		//for문이 가독성이 훨씬 좋다.
	}

}

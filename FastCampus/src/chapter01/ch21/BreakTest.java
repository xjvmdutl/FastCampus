package chapter01.ch21;

public class BreakTest {
	
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		//for(num =1; sum <= 100;num++) {
		for(num =1; ;num++) {
			sum += num;//sum이 100이될떄까지 더한다.
			if(sum >= 100) //그냥 for문에 조건을 넣으면 num이 하나 증가된 값이 나오기 떄문에
						    //if문에 break를 걸어서 증가되기 전에 for문 멈춤
				break;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}

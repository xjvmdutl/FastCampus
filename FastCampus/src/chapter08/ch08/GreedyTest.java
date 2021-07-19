package chapter08.ch08;

public class GreedyTest {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10};//가지고 있는 동전 타입
		int price = 8370;
		int count;
		for(int i=0;i<coins.length;++i) {
			count = 0;
			
			count += price / coins[i];//동전 갯수
			price = price % coins[i];//나머지 금액을 덮어 쓴다.
			//쭉 쌓아야 되거나 count가 있으면 더 로직이 들어가야 한다.
			System.out.println(coins[i] + " 자리 동전 " + count + "가 필요합니다.");
		}
	}

}

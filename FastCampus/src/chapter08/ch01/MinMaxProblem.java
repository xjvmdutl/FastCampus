package chapter08.ch01;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = numbers[0];//임의의 값으로 해도 된다.
		//배열안에 어떤값이 올지 모르기 떄문에 numbers[0]하는게 합리적
		int max =numbers[0];

		int minPos = 1;//0번째가 가장크고 작다
		int maxPos = 1;
		
		for(int i=1;i<numbers.length;++i) {
			if(min > numbers[i]) {
				min = numbers[i];//numbers[i]가 저장된 값보다 작다.
				minPos = i+1;//몇번째 이기 때문에 +1 해준다
			}
			if(max < numbers[i]) {
				max = numbers[i];//numbers[i]가 저장된 값보다 크다.
				maxPos = i+1;
			}
		}
		System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번째 입니다.");
		System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번째 입니다.");

	}

}

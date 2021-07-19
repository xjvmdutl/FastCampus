package chapter08.ch10;

public class Counting {

	public static void main(String[] args) {
		//범위가 확실한 경우에는 맞는 배열을 하나 선언 해주고 배열에 숫자를 더하는것이 더좋다.
		int[] people = { 55, 40, 27, 99, 76, 81, 29, 31, 33, 62};
		int[] ages = new int[10];//연령대에 따른 수 세기(범위가 있기 때문에 해당범위 배열 만든다)
		
		for(int i=0;i<people.length;++i) {
			int age = people[i];
			if(age < 30) 
				ages[0]++;
			else if(age < 40)
				ages[1]++;
			else if(age < 50)
				ages[2]++;
			else if(age < 60)
				ages[3]++;
			else if(age < 70)
				ages[4]++;
			else if(age < 80)
				ages[5]++;
			else if(age < 90)
				ages[6]++;
			else if(age <= 100)
				ages[7]++;
			
			int number = people.length;
			
			System.out.println(number + "몇 중 20 대는 "+ ages[0] + "명 입니다.");
			System.out.println(number + "몇 중 30 대는 "+ ages[1] + "명 입니다.");
			System.out.println(number + "몇 중 40 대는 "+ ages[2] + "명 입니다.");
			System.out.println(number + "몇 중 50 대는 "+ ages[3] + "명 입니다.");
			System.out.println(number + "몇 중 60 대는 "+ ages[4] + "명 입니다.");
			System.out.println(number + "몇 중 70 대는 "+ ages[5] + "명 입니다.");
			System.out.println(number + "몇 중 80 대는 "+ ages[6] + "명 입니다.");
			System.out.println(number + "몇 중 90 대는 "+ ages[7] + "명 입니다.");
		}
	}

}

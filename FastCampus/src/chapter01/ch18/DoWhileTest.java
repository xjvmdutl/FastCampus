package chapter01.ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		//while -> do while
		Scanner sc = new Scanner(System.in);
		int input;//입력받는애
		int sum = 0;
		/* do while 변환
		input = sc.nextInt();
		while(input != 0) {
			sum += input;
			input =sc.nextInt();
		}
		*/
		do {
			input =sc.nextInt();
			sum += input;
		}while(input!=0);//입력받아야 되는 코드가 반복문에도 있고 반복문 밖에도 있으므로 하나로 합친다
		System.out.println(sum);
	}
}

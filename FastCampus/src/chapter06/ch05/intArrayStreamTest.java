package chapter06.ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {//일반적 출력
			System.out.println(num);
		}
		System.out.println();
		Arrays.stream(arr).forEach(n->System.out.println(n));//intStream을 반환해준다.요소를 하나씩 꺼내라(람다식)
		//forEach로 하나씩 꺼내서 람다식으로 출력해라.
		
		IntStream is=Arrays.stream(arr);//풀어 쓰기
		//intStream이 제공하는 여러가지 연산이 많이 존재한다.
		//자료처리에 대한 추상적인 기능을 일관적으로 제공한다.(long,int,double 다 비슷하다.)
		is.forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();//연산 후에는 다시 스트림을 생성 해야된다.
		System.out.println(sum);
		long count = Arrays.stream(arr).count(); 
		System.out.println(count);
		//최종연산이 호출되는 순간 중간연산을 실행이된다.
		//스트림은 다른 메모리를 가지고 있고 정렬을 한다거나 해도 기존 데이터에 영향이 없다.
		
	}

}

package chapter06.ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		//무슨 연산이든 2가지 매게변수를 받는다<>안의 값을 받는다
		if(s1.getBytes().length >= s2.getBytes().length){
			return s1;
		}else {
			return s2;
		}
	}
	
}
public class ReduceTest {
	
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~","hello","Good morning","반갑습니다^^"};
		//방법 1 : reduce
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
			if(s1.getBytes().length >= s2.getBytes().length){
				//getBytes시 byteArray가 반환
				return s1;
			}else {
				return s2;
			}
		}));
		//방법 2 : 클래스 생성
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}

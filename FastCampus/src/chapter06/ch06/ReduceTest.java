package chapter06.ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		//���� �����̵� 2���� �ŰԺ����� �޴´�<>���� ���� �޴´�
		if(s1.getBytes().length >= s2.getBytes().length){
			return s1;
		}else {
			return s2;
		}
	}
	
}
public class ReduceTest {
	
	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���~~~","hello","Good morning","�ݰ����ϴ�^^"};
		//��� 1 : reduce
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
			if(s1.getBytes().length >= s2.getBytes().length){
				//getBytes�� byteArray�� ��ȯ
				return s1;
			}else {
				return s2;
			}
		}));
		//��� 2 : Ŭ���� ����
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}

package chapter06.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();//collection�� Stream�޼ҵ� ȣ��
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.println();
		//��Ʈ���� �����
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n + "\t"));
		System.out.println();
		//�������� sorted�� �����͸� ��ȯ���� �ʴ´�.
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.print(s + "\t"));
	}

}

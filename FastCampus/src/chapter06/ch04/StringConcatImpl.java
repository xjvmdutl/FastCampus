package chapter06.ch04;

public class StringConcatImpl implements StringConcat{//인터페이스 구현 클래스

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," +s2);
	}
	
}

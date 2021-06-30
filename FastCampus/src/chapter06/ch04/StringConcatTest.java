package chapter06.ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		StringConcat concat1 = (s,v) -> System.out.println(s+","+v);
		concat1.makeString(s1, s2);
		//클래스 없이 람다식으로 생성이 되는가? x 안된다 -> 내부적 익명 클래스가 만들어 진다.
		StringConcat concat2 = new StringConcat() {
			//내부적으로 이러한 익명클래스가 이렇게 만들어 지는것이다.
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1+"...."+s2);
			}
		}; 
		concat2.makeString(s1, s2);
	}
	
}

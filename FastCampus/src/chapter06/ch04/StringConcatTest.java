package chapter06.ch04;

public class StringConcatTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		StringConcat concat1 = (s,v) -> System.out.println(s+","+v);
		concat1.makeString(s1, s2);
		//Ŭ���� ���� ���ٽ����� ������ �Ǵ°�? x �ȵȴ� -> ������ �͸� Ŭ������ ����� ����.
		StringConcat concat2 = new StringConcat() {
			//���������� �̷��� �͸�Ŭ������ �̷��� ����� ���°��̴�.
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1+"...."+s2);
			}
		}; 
		concat2.makeString(s1, s2);
	}
	
}

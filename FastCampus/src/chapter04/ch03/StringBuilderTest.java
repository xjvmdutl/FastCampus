package chapter04.ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);//�Ű������� String�־��ټ� �ִ�.
		//hashCode�� Ȯ��
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);//�������� append�Ҽ� �ִ�.
		System.out.println(System.identityHashCode(buffer));
		String test = buffer.toString();//String ���ڷ� ���
		
		System.out.println(test);
	}

}

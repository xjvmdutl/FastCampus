package chapter04.ch02;

public class EqalsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100,"Lee");
		Student std2 = new Student(100,"Lee");
		Student std3 = std1;
		//�θ��� �л� //equals�� �ٸ���
		System.out.println(std1 == std2);//false ���
		//�ΰ��� �ٸ� ��ü�̱� ������
		System.out.println(std1.equals(std2));
		//���������� ����Ű�� �ּҰ� ���⶧���� ����
		System.out.println(std1 == std3);
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		//�������̵� �Ѱ��� �ƴ� ���� ��ð� ����ִ��� ã��
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());//hashCode���� ���ٰ� ���´�
		System.out.println(str2.hashCode());
		Integer i = 100;
		System.out.println(i.hashCode());
		
		std1.setStudentName("Kim");//�ν��Ͻ��� ���� �����ص� ����� ���� �״�� ���´�.
		Student copyStudent = (Student)std1.clone();//exception�̻����.
		System.out.println(copyStudent);//���� �߻�
		//Exception in thread "main" java.lang.CloneNotSupportedException: ch02.Student
		//at java.base/java.lang.Object.clone(Native Method)
		//at ch02.Student.clone(Student.java:34)
		//at ch02.EqalsTest.main(EqalsTest.java:30)
	}

}

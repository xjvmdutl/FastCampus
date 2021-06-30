package chapter04.ch02;

public class EqalsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100,"Lee");
		Student std2 = new Student(100,"Lee");
		Student std3 = std1;
		//두명의 학생 //equals는 다르다
		System.out.println(std1 == std2);//false 출력
		//두개가 다른 객체이기 떄문에
		System.out.println(std1.equals(std2));
		//참조변수가 가르키는 주소가 같기때문에 같다
		System.out.println(std1 == std3);
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		//오버라이드 한것이 아닌 실제 헤시가 어디있는지 찾기
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());//hashCode값이 같다고 나온다
		System.out.println(str2.hashCode());
		Integer i = 100;
		System.out.println(i.hashCode());
		
		std1.setStudentName("Kim");//인스턴스의 값을 변경해도 변경된 값이 그대로 나온다.
		Student copyStudent = (Student)std1.clone();//exception이생긴다.
		System.out.println(copyStudent);//오류 발생
		//Exception in thread "main" java.lang.CloneNotSupportedException: ch02.Student
		//at java.base/java.lang.Object.clone(Native Method)
		//at ch02.Student.clone(Student.java:34)
		//at ch02.EqalsTest.main(EqalsTest.java:30)
	}

}

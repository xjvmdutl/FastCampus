package chapter02.ch05;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); 
		studentLee.setStudentID(12345);
		studentLee.setStudentName("Lee");
		studentLee.setAddress("서울 강남구");
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.setStudentID(54321);
		studentKim.setStudentName("Kim");
		studentKim.setAddress("경기도 성남시");
		studentKim.showStudentInfo();
		
		
		System.out.println(studentKim);//패키지.클래스명@주소값(참조값)
		System.out.println(studentLee);//주소값은 힙에 자리를 잡고있는주소를 말한다(jvm이 임시로 준 주소값)
	}

}

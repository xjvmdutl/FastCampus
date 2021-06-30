package chapter02.ch04;

public class StudentTest {

	public static void main(String[] args) {
		//클래스 생성 방법 : 데이터타입 변수명 = new 데이터타입
		Student studentLee = new Student();// 크기가 정해져 있지 x 
										   // new 로 학생 한명을 생성한다 = 인스턴스
										   // class 하나를 기준으로 여러개의 인스턴스가 생성 가능하다
		//studentLee = 참조변수 , 생성되는 곳을 메모리 위치를 가리킨다
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="Kim";
		studentKim.address="경기도 성남시";
		studentKim.showStudentInfo();
		
		
	}

}

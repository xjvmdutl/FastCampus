package chapter02.ch06;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();//기본 생성자가 제공 되기 떄문 아무것도 안써도 가능
		//컴파일러가 디폴트 생성자를 만들어 주는 경우는 생성자가 없을때..
		//직접 만들어 주어야 한다.
		studentLee.grade =1;//이렇게도 가능하고 생성자로 채워줘도 된다.
		System.out.println(studentLee.showStudentInfo());//맴버변수는 아무 것도 안써도 자동으로 초기화 된다.
		Student studentKim = new Student(123456,"kim",3);
		System.out.println(studentKim.showStudentInfo());//맴버변수는 아무 것도 안써도 자동으로 초기화 된다.
		
	}

}

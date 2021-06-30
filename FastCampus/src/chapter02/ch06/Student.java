package chapter02.ch06;

public class Student {
	public int studentNumber;
	public String studentName;
	public int grade;

	/*
	 * public Student() {// 생성자에서 값을 초기화 해주고 싶을때는 어떻게 하나?
	 * System.out.println("student 생성"); }
	 */
	public Student(int studentNumber, String studentName, int grade) {
		studentNumber = studentNumber;//이렇게 쓰면 문제가 있다.
		//why? 변수를 찾는 가시성은 가장 가까운데서 찾기 때문에 매개변수를 매개변수로 대입한다.
		//맴버변수가 매개변수로 대입하고 싶을경우는?
		this.studentNumber=studentNumber;//맴버변수 = 매개변수
		this.studentName=studentName;//맴버변수 = 매개변수
		this.grade=grade;//맴버변수 = 매개변수
	}
	public Student() {
		
	}
	public String showStudentInfo() {
		//int i;//해당 지역에서만 쓰는데 초기화가 되지 않기 때문에 에러
		
		return studentName + "학생의 학번은 "+ studentNumber + "이고, "+grade +"학년 입니다.";//+ i;
	}
	
}

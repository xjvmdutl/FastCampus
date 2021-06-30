package chapter02.ch09;

public class Student {
	int studentId;
	String studentName;
	Subject korea;//참조 변수
	Subject math;
	Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
		//생성자에서 참조변수를 생성해준다.(new)
		korea = new Subject();
		math = new Subject();
	}
	//참조 자료형으로 나누어야지 좀더 각각의 객체에 대하여 역활과 기능을 분명하게 하는 부분이 있다.
	public void setKoreaSubject(String name,int score) {//국어과목
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name,int score) {//수학과목
		math.subjectName = name;
		math.score = score;
	}
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "학생의 총점은 "+total+"점 입니다.");
	}
}

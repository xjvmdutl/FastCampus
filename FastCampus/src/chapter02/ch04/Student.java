package chapter02.ch04;

public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {//학생 정보를 보여준다.
		System.out.println(studentID + "학번 학생의 이름은 "+studentName+" 이고, 주소는 "+address+"입니다.");
	}
	
	public String getStudentName(){//studentName을 가져가는 함수
		return studentName;
	}
	public void setStudentName(String name) {//studentName을 지정하는 함수
		studentName = name; 
	}
	
}

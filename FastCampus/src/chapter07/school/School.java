package chapter07.school;

import java.util.ArrayList;

public class School {
	//학교 객체는 여러개일수 없다 //singleton
	private static School instance = new School();
	
	private ArrayList<Student> studentList = new ArrayList<>();//학생
	private ArrayList<Subject> subjectList = new ArrayList<>();//과목
	
	private School() {}//생성자 private로 생성 못하게 한다.
	
	public static School getInstance() {
		if(instance == null)
			instance = new School(); 
		return instance;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	
}

package chapter02.ch24;

import java.util.ArrayList;

public class Student {
	private int studentNum;
	private String studentName;
	private ArrayList<Subject> subList;
	
	public Student(int studentNum,String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
		subList = new ArrayList<>();
	}
	public void addSubject(String subjectName,int subjectScore) {
		subList.add(new Subject(subjectName,subjectScore));
	}
	public void showStudentInfo() {
		int totalScore = 0;
		for(int i=0;i<subList.size();++i) {
			System.out.println("학생 "+ studentName + "의 "+subList.get(i).getSubjectName() + " 과목 성적은 "+ subList.get(i).getSubjectScore()+"입니다.");
			totalScore += subList.get(i).getSubjectScore();
		}
		System.out.println("학생 "+ studentName + "의 총점은 "+totalScore + " 입니다.");
	}
}

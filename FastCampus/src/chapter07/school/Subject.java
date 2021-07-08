package chapter07.school;

import java.util.ArrayList;

import chapter07.utils.Define;

public class Subject {
	private int subjectId;// ���� ������ȣ
	private String subjectName;//���� �̸�
	private int gradeType;// ���� �� ��� �⺻�� A, B ��� 
	//���� ��û�� �л� ����Ʈ 
	//register() �޼��带 ȣ���ϸ� ����Ʈ�� �߰��� 
	private ArrayList<Student> studentList = new ArrayList <Student>();
	public Subject(String subjectName,int subjectId) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE;//�⺻������ A, BŸ��
	}
	public void register(Student student) {//������û
		studentList.add(student);
	}
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGradeType() {
		return gradeType;
	}
	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
}

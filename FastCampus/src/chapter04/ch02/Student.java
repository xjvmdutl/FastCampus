package chapter04.ch02;

public class Student implements Cloneable{
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum,String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	public String toString() {
		return studentNum + ", "+ studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	//�ΰ��� ���ÿ� �������̵� �ؾߵȴ�.
	@Override
	public int hashCode() {
		
		return studentNum;//�й��� ������ ���� �й��� ���´�
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;//obj�� student�� ����
			if(this.studentNum == std.studentNum)
				return true;//equals �޼ҵ尡 true�� ���´�
			else 
				return false;
		}
		return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

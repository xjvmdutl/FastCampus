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
	//두개가 동시에 오버라이딩 해야된다.
	@Override
	public int hashCode() {
		
		return studentNum;//학번이 같을때 같은 학번이 나온다
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;//obj를 student로 변경
			if(this.studentNum == std.studentNum)
				return true;//equals 메소드가 true로 나온다
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

package chapter06.ch11;

public class Student {
	private String studentName; 
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){
		//throws�� ���� , �����ڿ��� throws�� ���� �ʴ´�->illegalArgument�� ���� �ؾߵȴ�
		if(studentName == null){ 
			throw new StudentNameFormatException("name must not be null");
		} 
		if( studentName.split(" ").length > 3) {
			throw new StudentNameFormatException("�̸��� �ʹ� ����"); 
			
		}
		this.studentName = studentName;
	} 
	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return studentName; 
	}
}

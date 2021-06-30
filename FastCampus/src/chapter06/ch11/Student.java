package chapter06.ch11;

public class Student {
	private String studentName; 
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){
		//throws가 없다 , 생성자에는 throws를 하지 않는다->illegalArgument로 제어 해야된다
		if(studentName == null){ 
			throw new StudentNameFormatException("name must not be null");
		} 
		if( studentName.split(" ").length > 3) {
			throw new StudentNameFormatException("이름이 너무 길어요"); 
			
		}
		this.studentName = studentName;
	} 
	public String getStudentName() {
		myLogger.fine("begin getStudentName()");
		return studentName; 
	}
}

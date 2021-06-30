package chapter02.ch17;

public class Employee {
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		int i = 0; //함수 내부 지역 변수//지역 변수 사용하는건 문제 x
		//employeeName = "Lee";//이 메소드를 호출하는 순간에 인스턴스 변수가 생성되지 않을 수도 있기 떄문에 사용 불가능
		
		return serialNum;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}

package chapter02.ch16;

public class Employee {
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {//생성자에서 사번이 증가되는 코드를 써야된다.
		serialNum++;
		employeeId = serialNum;
		//static 변수는 모두가 공유하기 때문에 사번아이디는 공유될수 없기 때문에 맴버변수에 대입하여 써야된다.
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

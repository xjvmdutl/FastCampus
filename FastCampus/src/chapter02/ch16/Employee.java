package chapter02.ch16;

public class Employee {
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {//�����ڿ��� ����� �����Ǵ� �ڵ带 ��ߵȴ�.
		serialNum++;
		employeeId = serialNum;
		//static ������ ��ΰ� �����ϱ� ������ ������̵�� �����ɼ� ���� ������ �ɹ������� �����Ͽ� ��ߵȴ�.
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
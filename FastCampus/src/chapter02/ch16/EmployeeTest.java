package chapter02.ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		System.out.println(employeeLee.serialNum);
		//노란 줄로 나오는 이유는 인스턴스 변수로 static 변수를 접근했기 떄문에
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		
		
		System.out.println(employeeLee.getEmployeeName() + "님의 사번은 "+employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은 "+employeeKim.getEmployeeId());
		*/
		System.out.println(Employee.serialNum);//클래스 명으로 static 변수를 접근해야된다.
	}

}

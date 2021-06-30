package chapter03.ch03;

public class VIPCustomer extends Customer {
//	기존 기능 확장할 것이 많이 떄문에 상속을 받는게 좋다.

	double salesRatio;
	String agentID;
	/*
	public VIPCustomer() {
		//Customer를 상속받기 때문에 상위 클래스의 생성자를 호출한다(디폴트 생성자) = super() 
		//super();//하위 클래스가 상위 클래스의 인스턴스의 상위 값을 가진다
		//상위 클래스 생성자 호출하는 코드가 없을 경우 super()가 자동 호출
		//상위 클래스가 defualt 생성자가 아닐경우 오류가 난다 super() 메소드를 호출해야한다.
		//super(customerID, agentID);
		//상위 클래스의 생성자를 명시적으로 호출해야 된다.
		super(0,"no name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";
		
		System.out.println("VIPCustomer() Call");//로그

	}
	*/
	
	public VIPCustomer(int customerID, String customeName) {
		super(customerID, customeName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		System.out.println("VIP(int,String) call");
	}
	public String getAgentID() {
		return agentID;
	}
}

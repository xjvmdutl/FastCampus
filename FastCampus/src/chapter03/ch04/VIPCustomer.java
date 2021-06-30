package chapter03.ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;
	/*
	public VIPCustomer() {
		super(0,"no name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customeGrade = "VIP";
		
	}
	*/
	
	public VIPCustomer(int customerID, String customeName) {
		super(customerID, customeName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	
	public String getAgentID() {
		return agentID;
	}
	//override 방법 1) copy 2) source->overriding(이클립스 전용)
	@Override//어노테이션, 이 메소드는 오버라이딩 메소드, 컴파일러에 오버라이딩 메소드를 명시해주는것
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;//원래의 기능을 기대로 사용한다.
	}
	

}

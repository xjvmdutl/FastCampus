package chapter03.ch02;

public class VIPCustomer extends Customer {//기존 기능 확장할 것이 많이 떄문에 상속을 받는게 좋다.
	/* 해당 속성이 필요 하다. */
	//private int customerID;
	//private String customeName;
	//private String customeGrade;
	//int bonusPoint;
	//double bonusRatio;
	/* 추가 속성 */
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";//private 속성이기때문에 에러가 난다(
	}
	public String getAgentID() {
		return agentID;
	}
}

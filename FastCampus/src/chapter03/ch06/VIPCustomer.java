package chapter03.ch06;

public class VIPCustomer extends Customer {

	double salesRatio;
	String agentID;


	
	public VIPCustomer(int customerID, String customeName) {
		super(customerID, customeName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	
	public String getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	

}

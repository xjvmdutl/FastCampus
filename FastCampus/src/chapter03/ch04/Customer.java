package chapter03.ch04;

public class Customer {

	protected int customerID;
	protected String customerName; 
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	/*
	public Customer() {
		customeGrade = "SILVER";
		bonusRatio = 0.01;
	}*/
	public Customer(int customerID,String customeName) {
		this.customerID = customerID;
		this.customerName = customeName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	//������ ��ȯ�ϴ� ���� ������ �ؾ��Ѵ�.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";  
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
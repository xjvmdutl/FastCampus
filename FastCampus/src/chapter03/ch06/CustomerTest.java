package chapter03.ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		Customer customerT = new Customer(10010,"Tomas");
		Customer customerJ = new Customer(10020,"James");
		Customer customerF = new GoldCustomer(10030,"Fdward");
		Customer customerP = new GoldCustomer(10040,"Percy");
		Customer customerK = new VIPCustomer(10050,"Kim");
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerF);
		customerList.add(customerP);
		customerList.add(customerK);
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());//상위클래스 메소드
		}
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);//가격이 고객마다 다르게 적용되는걸 확인이 가능하다(다형성)
			System.out.println(customer.getCustomerName() + "님이 "+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 "+customer.bonusPoint+"입니다.");
		}
	}

}

package chapter03.ch08;

import java.util.ArrayList;

import chapter03.ch06.Customer;
import chapter03.ch06.GoldCustomer;
import chapter03.ch06.VIPCustomer;

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
		if(customerF instanceof VIPCustomer) {//해당 인스턴스가 VIPCustomer인지 물어본다.
			//해당 인스턴스가 본래 인스턴스인지를 확인하는 문법
			VIPCustomer vc = (VIPCustomer)customerF;//Gold이지만 VIP로 변환할수는 없다 (컴파일러가 잡을수 없다)
			System.out.println();
		}
	}

}

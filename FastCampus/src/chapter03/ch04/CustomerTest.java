package chapter03.ch04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint=1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");//VIPCustomer호출전 Customer가 먼저 호출된다.
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		Customer vc = new VIPCustomer(12345, "noname");
		
		System.out.println(vc.calcPrice(1000));//해당 함수는 어떤 메소드를 호출할까?
		//인스턴스을 메소드를 호출한다. //가상함수,가상메소드
		
	}

}

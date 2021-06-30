package chapter03.ch02;

public class CustomerTest {

	public static void main(String[] args) {
		/*
			Customer customerLee = new Customer();
			customerLee.setCustomeName("이순신");
			customerLee.setCustomerID(10010);
			customerLee.bonusPoint = 1000;
			System.out.println(customerLee.showCustomerInfo());
		*/
		
		VIPCustomer customerKim = new VIPCustomer();//VIP만 썻는데도 만들수 있다(메모리에 Customer가 생성이 됬다는 뜻이다)
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());//customer꺼지만 상속을 받아 사용가능
	}

}

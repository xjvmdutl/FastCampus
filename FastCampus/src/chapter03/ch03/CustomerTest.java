package chapter03.ch03;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");//VIPCustomer호출전 Customer가 먼저 호출된다.
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//하위 클래스가 생성될때 반드시 상위클래스 생성자가 생성된다.
		//만약 생성자를 따로 선언하지 않을경우 디폴트 생성자를 실행하고 매개변수가 있는 생성자를 호출하면 따로 생성자를 호출 해주어야 한다.
		
		Customer vc = new VIPCustomer(12345,"noname");
		//vip로 생성했지만 customer 로 받을수가 있다.
		//단 타입은 customer이기 때문에 customer꺼만 사용할수있다.
		//인스턴스는 모두 생성이 되었지만 참조변수가 customer형이기 떄문에 customer꺼만 사용할수있다. 
	}

}

package chapter03.ch15;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();//재정의를 했기때문에 재정의한 메소드 호출
		
		Sell seller = customer;
		seller.sell();
		seller.order();//재정의를 했기때문에 재정의한 메소드 호출
	}
}

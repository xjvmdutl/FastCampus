package chapter03.ch15;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		//Buy,Sell 둘중 하나의 메소드를 재정의 하라 라는 에러 메세지 표기
		//Sell.super.order();
		System.out.println("customer order");
	}
	
	public void hello() {
		System.out.println("hello");
	}
}

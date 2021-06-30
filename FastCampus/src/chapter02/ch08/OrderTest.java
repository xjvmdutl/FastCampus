package chapter02.ch08;

public class OrderTest {

	public static void main(String[] args) {
		Order orderOne = new Order("20201102003", "01023450001", "서울시 강남구 역삼동", "20201102", 130258, 35000, "0003");
		System.out.println(orderOne.orderInfo());
		
	}

}

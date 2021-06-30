package chapter02.ch08;

public class Order {
	private String orderNum;
	private String phoneNum;
	private String orderAddress;//주소
	private String orderDate;//주문 날짜
	private int orderTime;//주문 시간
	private int orderPrice;//주문 가격
	private String menuNum;//메뉴 번호
	public Order(String orderNum,String phoneNum,String orderAddress,String orderDate, int orderTime,int orderPrice,String menuNum) {
		this.orderNum=orderNum;
		this.phoneNum=phoneNum;
		this.orderAddress=orderAddress;
		this.orderDate=orderDate;
		this.orderTime=orderTime;
		this.orderPrice=orderPrice;
		this.menuNum=menuNum;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getMenuNum() {
		return menuNum;
	}
	public void setMenuNum(String menuNum) {
		this.menuNum = menuNum;
	}
	public String orderInfo() {
		return "주문 접수 번호 : " + orderNum + " \n"
				+ "주문 핸드폰 번호 : " + phoneNum + "\n"
				+ "주문 집 주소 : " + orderAddress + "\n"
				+ "주문 날짜 : " + orderDate + "\n"
				+ "주문 시간 : " + orderTime + "\n"
				+ "주문 가격 : " + orderPrice + "\n"
				+ "메뉴 번호 : " + menuNum;
	}
	
	
	
}

package chapter02.ch14;

public class Bus {
	int busNumber;//버스번호
	int passengerCount;//승객수
	int money;//수입
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {//money=학생이 지불한 돈, 객체 협력
		this.money += money;
		passengerCount++;//승객수도 증가
	}
	public void showBusInfo() {
		System.out.println(busNumber + "번의 승객 수는 "+ passengerCount +"번 이고, 수입은 "+ money + "원입니다.");
	}
}

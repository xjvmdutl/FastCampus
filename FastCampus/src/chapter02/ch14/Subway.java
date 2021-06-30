package chapter02.ch14;

public class Subway {
	int lineNumber;//지하철 번호
	int passengerCount;//승객수
	int money;//수입
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번의 승객 수는 "+ passengerCount + "명 이고, 수입은 "+money+"원 입니다.");
	}
}

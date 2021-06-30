package chapter02.ch15;

public class Tex {
	String companyName;
	int money;
	public Tex(String companyName) {
		this.companyName = companyName;
	}
	public void take(int money) {
		this.money += money;
	}
	public void showTexInfo() {
		System.out.println(companyName + "택시 수입은 "+money+"원 입니다.");
	}
}

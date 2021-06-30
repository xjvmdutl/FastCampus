package chapter03.ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Computer desktop = new Desktop();
		//desktop.//해당 인스턴스에서 사용 가능한 메소드,변수는 Computer꺼만 사용가능하다
		//Computer computer = new Computer();//해당 인스턴스는 생성 불가능
		desktop.display();
	}

}

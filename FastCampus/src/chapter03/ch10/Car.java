package chapter03.ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	public void washCar() {//해당 메소드는 추상메소드가 아니라 구현 내용이 안된것이다//오류 없다.
		//필요한 경우에는 재정의를 해서 구현 한다.
		//hook메소드
	}
	final public void run() {
		//해당 흐름은 변경되면 안되기 떄문에 final 선언
		//해당 시라리오를 프로그래머가 변경이 불가능하고 상세 구현할 클래스는 상속받은 클래스에서 구현한다.
		startCar();
		drive();
		wiper();//추가 메소드//에러가 발생//추상메소드를 추가로 구현해야된다
		stop();
		turnOff();
		washCar();
	}
}

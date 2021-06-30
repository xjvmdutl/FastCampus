package chapter03.ch09;

public abstract class Computer {//abstract를 포함하고 있으니 abstract로 구현하라고 오류가 뜬다
	public abstract void display();//추상메소드//구현 하지 않을거기 떄문에 abstract를 추가
	public abstract void typing();
	//display,typing은 Computer가 알지 못한다, 공통으로 쓸 메소드만 알고 있다.
	//하위 클래스에게 그 책음을 위임한다.
	//computer는 구현하지 않고 하위클래스에서 구현을 해라...
	//추상 클래스는 상속을 위한 클래스이다.
	
	
	public void turnOn() {//해당 메소드는 구현이 가능하다.
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}

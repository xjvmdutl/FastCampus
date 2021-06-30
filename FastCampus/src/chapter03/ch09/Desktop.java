package chapter03.ch09;

public class Desktop extends Computer{
	//2개의 추상 메소드를 구현해야 한다.//구현을 안할거면 해당 클래스도 abstract가 되야된다.
	//모두 구현되어 있는데 추상클래스로 선언할 경우 new로 선언할수 없다.
	//모두 구현되어 있는데 추상클래스로 선언할 경우에는 상속기능만을 위한 클래스이기 때문에 생성 불가능(인스턴스 생성 불가능)
	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	//이미 상위 클래스에 정의된 메소드를 재정의 해도 상관없다.
	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
	

}

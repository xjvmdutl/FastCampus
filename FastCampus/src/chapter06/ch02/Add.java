package chapter06.ch02;

public interface Add {
	//자바에서는 클래스 없이 메소드만 호출할수 없기때문에 람다식용으로 함수를 선언한다.
	public int add(int x,int y);//이렇게 선언하고 이 인터페이스를 구현하면된다.
}

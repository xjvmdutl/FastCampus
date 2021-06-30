package chapter03.ch09;

public abstract class NoteBook extends Computer {
	//한개의 메소드는 구현 하지 않았기 떄문에 abstract클래스로 만들어야 한다.
	//하나만 구현
	@Override
	public void display() {
		System.out.println("NoteBook display");
	}
	

}

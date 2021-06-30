package chapter05.ch07;

public class Plastic extends Meterial{//Meterial을 상속을 받아야 한다.
	public String toString() {
		return "재료는 Plastic 입니다";
	}

	@Override
	public void doPrinting() {//하위 클래스에서 구현
		// TODO Auto-generated method stub
		
	}
}

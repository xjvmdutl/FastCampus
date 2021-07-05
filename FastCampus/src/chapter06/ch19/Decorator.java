package chapter06.ch19;

public abstract class Decorator extends Coffee{//상속용 이기떄문에 abstract를 붙여야 한다
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		//혼자 돌아갈수 없으니 매개변수를 받아야한다.
		//매개변수로 받는 커피는 커피에서 상속받은 모든 요소가 다 올수 있다.
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
}

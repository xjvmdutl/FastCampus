package chapter06.ch19;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		//생성자를 만들어야되는 이유는 상위클래스에서 default생성자가 없기 떄문에
		super(coffee);
	}
	
	public void brewing(){
		super.brewing(); 
		System.out.print("Adding Milk ");
	}
		
}

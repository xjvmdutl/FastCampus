package chapter06.ch19;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		//�����ڸ� �����ߵǴ� ������ ����Ŭ�������� default�����ڰ� ���� ������
		super(coffee);
	}
	
	public void brewing(){
		super.brewing(); 
		System.out.print("Adding Milk ");
	}
		
}

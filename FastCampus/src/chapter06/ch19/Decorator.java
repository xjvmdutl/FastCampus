package chapter06.ch19;

public abstract class Decorator extends Coffee{//��ӿ� �̱⋚���� abstract�� �ٿ��� �Ѵ�
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		//ȥ�� ���ư��� ������ �Ű������� �޾ƾ��Ѵ�.
		//�Ű������� �޴� Ŀ�Ǵ� Ŀ�ǿ��� ��ӹ��� ��� ��Ұ� �� �ü� �ִ�.
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
}

package chapter06.ch01;
class Outer2 {
	int outNum = 100;//Outter Ŭ������ �ν��Ͻ� ����
	static int sNum = 200;
	
	Runnable getRunnable(int i){//Ŭ������ ������ȭ �ҋ� ����ϴ� �������̽��̴�(Runnable)
		
		int num = 10;
		//�ŰԺ����� num�� ���� �޸𸮿� �����ȴ�
		//����� final �� ���� �ʾƵ� �ڵ����� �����Ϸ��� �ٲ��ش�
		/*
		class MyRunnable implements Runnable{//���� Ŭ����
			
			int localNum = 1000;

			@Override
			public void run() {
				
				//i = 50;
				//num = 20;
				//���� : ���°��� ������ ���� �ʰ� �� ������ ������ ����.
				//�żҵ��� ���۵Ǵ� ������ Ŭ���� �����ֱⰡ �ٸ��� ������ ���� ���� 
				//i, num ������� �޼ҵ� ȣ���� ������ �Ǹ� ��������� run�̶�� �޼ҵ�� �Ǵٽ� ȣ��ɼ� �ֱ⶧����
				//stack ������ ������ �ȵǰ� final������ �ؾߵȴ�
				System.out.println("i = "+ i);
				System.out.println("num = "+ num);
				System.out.println("localNum = "+ localNum);
				
				System.out.println("outNum = "+ outNum +"(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer2.sNum = "+ Outer2.sNum +"(�ܺ� Ŭ���� ���� ����)");
			}
			
		}
		*/
		return new Runnable(){//���� ��Ŭ���� �̸��� �ܺο��� ����� �ʿ䰡���� - �͸�Ŭ����
			int localNum = 1000;
			@Override
			public void run() {
			
				//i=100;//�Ȱ��� ������ �ִ� (���ȭ�� �Ǳ� ����)
				System.out.println("i = "+ i);
				System.out.println("num = "+ num);
				System.out.println("localNum = "+ localNum);
				
				System.out.println("outNum = "+ outNum +"(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer2.sNum = "+ Outer2.sNum +"(�ܺ� Ŭ���� ���� ����)");
			}
		};//�޼ҵ峻�ο��� ������ Ŭ������ ����
	}
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
}
public class AnonumousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		//������� �޼ҵ带 ȣ���߱⶧���� ���ÿ��� ������ߵȴ�.
		//������ ���ȭ �Ǳ� ������ ���� ����Ҽ��� �ִ�. 
		//������ �Ұ���
		runner.run();
		out.runnable.run();
	}

}

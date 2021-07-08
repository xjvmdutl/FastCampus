package chapter06.ch20;
//class MyThread extends Thread{
//Thread�� extends�ÿ��� �����ؾߵ� �޼ҵ尡 ����
//Runable�� �����ÿ��� run �޼ҵ带 �����ؾߵȴ�
class MyThread implements Runnable{
	//�����尡 �����  Run �޼ҵ尡 ȣ��ȴ�.
	@Override
	public void run() {
		int i;
		for(i=1;i<=200;++i)
			System.out.print(i + "\t");
	}
	
}
public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " Start");
		//������[�����带 ȣ���� �Լ�, �켱����,������ ���ѱ׷�]
		//���� ������ , th1, th2 �� ���ư���.
		//���� �����尡 ���� ���� ������ th1,th2�� �����Ű�� �����Ѵ�.
		//MyThread th1 = new MyThread();
		//MyThread th2 = new MyThread();
		
		
		//th1.start();//������ ���� �޼ҵ�
		//th2.start();
		//start�� thread�� �޼ҵ� �̱� ������ ���� ���Ѵ�.
		
		MyThread runnable = new MyThread();
		//Runnable�� ��ü�� �����ϰ� thread�� �־��־�� �Ѵ�.
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + " End");
		
		Runnable run = new Runnable() {
			@Override
			public void run() {
				//�͸�Ŭ������ �ٷ� ȣ���Ҽ��� �ִ�
				System.out.println("1");
			}
		};
	}

}

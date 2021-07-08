package chapter06.ch22;
class Bank{
	//������ ���� �ڿ��� money���� JAVA������ money�� �����ڿ����� ����.
	private int money = 10000;

	public void saveMoney(int save) {
		//�ش� synchronized�Լ��� ���� �Ǹ� �� �޼ҵ带 ����ϴ� ���� lock�� �ɸ���
		//Block���°� �ȴ�.
		//�Ǵٸ� ���
		synchronized (SyncMain.myBank) { // Thread�� �Ǵ�.
			//��� �κп�  Rock�� �ɾ���
			int m = getMoney();
			try {
				Thread.sleep(3000);
				//Thread�� Static �޼ҵ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setMoney(m+save);
		}
	}

	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		try {
			Thread.sleep(200);
			//Thread�� Static �޼ҵ�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
class Park extends Thread {
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		//����
		System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
		
	}
}
class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		//����
		System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
		
	}
}
public class SyncMain {
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		Park p = new Park();
		p.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ParkWife pw = new ParkWife();
		pw.start();
		//���� ���µ� ������ �ݾ׸� �߰��ȴ�.
		//why? park -> 10000, ParkWife -> 10000
		//		3�ʴ��			0.2�ʵ� ��� ->9000
		//		->������ ������� 10000���� ������ �ͼ� update�� �Ѵ�.
		//    Park�� Save�� �ϴµ��� ParkWife�� ���� resource�� �ǵ鿩�� �������߻��� ���̴�.
		//	java������ SYN�� ����ϸ� �ȴ�(����ȭ�� ���)
	}

}

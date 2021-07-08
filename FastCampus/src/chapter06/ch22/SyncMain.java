package chapter06.ch22;
class Bank{
	//실질적 공유 자원은 money지만 JAVA에서는 money를 공유자원으로 본다.
	private int money = 10000;

	public void saveMoney(int save) {
		//해당 synchronized함수를 쓰게 되면 이 메소드를 사용하는 동안 lock이 걸린다
		//Block상태가 된다.
		//또다른 방법
		synchronized (SyncMain.myBank) { // Thread에 건다.
			//대당 부분에  Rock을 걸엇라
			int m = getMoney();
			try {
				Thread.sleep(3000);
				//Thread의 Static 메소드
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
			//Thread의 Static 메소드
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
		//저금
		System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
		
	}
}
class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		//지출
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
		//돈을 썻는데 저장한 금액만 추가된다.
		//why? park -> 10000, ParkWife -> 10000
		//		3초대기			0.2초뒤 출금 ->9000
		//		->이전에 가지고온 10000원을 가지고 와서 update를 한다.
		//    Park이 Save를 하는동안 ParkWife가 공유 resource를 건들여서 문제가발생한 것이다.
		//	java에서는 SYN를 사용하면 된다(동기화를 사용)
	}

}

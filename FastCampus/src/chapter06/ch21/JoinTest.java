package chapter06.ch21;

public class JoinTest extends Thread{
	int start;
	int end;
	int total;//초기화 안해도 된다(전역변수이기 떄문에)
	public JoinTest(int start,int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start;i<=end;++i) {
			total += i;
		}
	}
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51,100);
		
		jt1.start();
		jt2.start();
		//main이 도는 동안 쓰레드가 다 끝나야 한다.
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//main이 Non-Runnable상태로 빠진다
		//InterruptedException을 처리해야된다.
		//why? 메인 쓰레드가 돌아오지 못하게 될경우 메인 Thread를 실행해야되기 때문에 해당 에러를 처리 해 주어야된다.
		int lastTotal = jt1.total + jt2.total;
		System.out.println("jt1.total  = "+jt1.total);
		System.out.println("jt2.total  = "+jt2.total);
		System.out.println("lastTotal  = "+lastTotal);
		System.out.println(Thread.currentThread() + " end");
	}
	
}

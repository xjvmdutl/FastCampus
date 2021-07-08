package chapter06.ch20;
//class MyThread extends Thread{
//Thread를 extends시에는 구현해야될 메소드가 없다
//Runable을 구현시에는 run 메소드를 구현해야된다
class MyThread implements Runnable{
	//쓰레드가 수행시  Run 메소드가 호출된다.
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
		//쓰레드[쓰레드를 호출한 함수, 우선순위,쓰레드 속한그룹]
		//메인 쓰레드 , th1, th2 가 돌아간다.
		//메인 쓰레드가 가장 먼저 끝난다 th1,th2를 실행시키고 종료한다.
		//MyThread th1 = new MyThread();
		//MyThread th2 = new MyThread();
		
		
		//th1.start();//쓰레드 시작 메소드
		//th2.start();
		//start는 thread을 메소드 이기 때문에 쓰지 못한다.
		
		MyThread runnable = new MyThread();
		//Runnable한 객체를 생성하고 thread에 넣어주어야 한다.
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + " End");
		
		Runnable run = new Runnable() {
			@Override
			public void run() {
				//익명클래스로 바로 호출할수도 있다
				System.out.println("1");
			}
		};
	}

}

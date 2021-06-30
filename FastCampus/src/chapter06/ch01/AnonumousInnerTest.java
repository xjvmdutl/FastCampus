package chapter06.ch01;
class Outer2 {
	int outNum = 100;//Outter 클래스의 인스턴스 변수
	static int sNum = 200;
	
	Runnable getRunnable(int i){//클레스를 쓰레드화 할떄 사용하는 인터페이스이다(Runnable)
		
		int num = 10;
		//매게변수와 num은 스택 메모리에 생성된다
		//현재는 final 로 잡지 않아도 자동으로 컴파일러가 바꿔준다
		/*
		class MyRunnable implements Runnable{//내부 클래스
			
			int localNum = 1000;

			@Override
			public void run() {
				
				//i = 50;
				//num = 20;
				//오류 : 쓰는것은 오류가 나지 않고 값 수정시 오류가 난다.
				//매소드의 시작되는 시점과 클래스 생성주기가 다르기 때문에 나는 에러 
				//i, num 같은경우 메소드 호출이 끝나게 되면 사라지지만 run이라는 메소드는 또다시 호출될수 있기때문에
				//stack 영역에 잡히면 안되고 final선언을 해야된다
				System.out.println("i = "+ i);
				System.out.println("num = "+ num);
				System.out.println("localNum = "+ localNum);
				
				System.out.println("outNum = "+ outNum +"(외부 클래스 인스턴스 변수)");
				System.out.println("Outer2.sNum = "+ Outer2.sNum +"(외부 클래스 정적 변수)");
			}
			
		}
		*/
		return new Runnable(){//굳이 이클래스 이름이 외부에서 사용할 필요가없다 - 익명클래스
			int localNum = 1000;
			@Override
			public void run() {
			
				//i=100;//똑같이 문제가 있다 (상수화가 되기 떄문)
				System.out.println("i = "+ i);
				System.out.println("num = "+ num);
				System.out.println("localNum = "+ localNum);
				
				System.out.println("outNum = "+ outNum +"(외부 클래스 인스턴스 변수)");
				System.out.println("Outer2.sNum = "+ Outer2.sNum +"(외부 클래스 정적 변수)");
			}
		};//메소드내부에서 선언한 클래스를 리턴
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
		//원래라면 메소드를 호출했기때문에 스택에서 사라져야된다.
		//하지만 상수화 되기 때문에 값을 사용할수는 있다. 
		//변경은 불가능
		runner.run();
		out.runnable.run();
	}

}

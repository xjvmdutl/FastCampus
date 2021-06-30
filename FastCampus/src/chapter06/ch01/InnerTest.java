package chapter06.ch01;
class OutClass{
	private int num =10;
	private static int sNum = 20;
	private InClass inClass;
	public OutClass(){//outer클래스 생성시 inclass가 만들어지게 많이 사용한다.
		inClass = new InClass();
	}
	private class InClass{//private 형으로 많이 사용한다.
		int iNum = 100;
		//static int sInNum = 500;//에러 : 인스턴스 inner클래스이기 때문에 outer클래스가 생성후 생성되기 떄문에 에러가난다.
		//전역변수 사용 불가 -> 정적 내부클래스에서 사용해야 된다.
		void inTest(){ 
			
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)"); 
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		void inTest(){ 
			
			//System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)"); //외부클래스의 생성과 상관없이 클래스가 만들어 질수 있기 떄문에 
																					//정적클래스 스택틱 메소드에서 외부 클래스 변수를 사용이 불가능하다
			System.out.println("InClass num = " +iNum + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		static void sTest() {
			//System.out.println("InClass num = " +iNum + "(외부 클래스의 인스턴스 변수)");
			//내부클래스 인스턴스 변수를 사용 불가능 //클래스가 생성되지 않아도 해당 메소드가 실행될수 있기 떄문에
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		/*
			OutClass outClass = new OutClass();
			outClass.usingClass();
			System.out.println();
		*/
		//내부 클래스가 private 가 아닐경우 외부에서 사용가능하다.
		//문법적으로는 가능하나 자주 사용 x
		//OutClass.InClass inner = outClass.new InClass();
		//inner.inTest();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		OutClass.InStaticClass.sTest();
		//클래스 생성과 무관하게 사용가능
		
	}
}

package chapter05.ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		printer.setMaterial(powder);//넣는거는 문제 x
		Powder p =(Powder) printer.getMaterial();//에러 //형변환이 필요하다.
		//번거롭기 때문에 generic 프로그래밍이 나왔다
		
	}

}

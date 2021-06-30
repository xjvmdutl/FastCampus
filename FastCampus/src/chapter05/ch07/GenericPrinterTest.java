package chapter05.ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter<Powder> powerderPrinter = new GenericPrinter<>();
		powerderPrinter.setMaterial(powder);
		Powder p = (Powder)powerderPrinter.getMaterial();
		System.out.println(powerderPrinter.toString());
		//재료들이 공통으로 사용될 메소드는 Meterial에서 사용해야 된다.
		p.doPrinting();
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<>();//사용불가능
		//c,c++을 Template 기능과 같다
	}

}

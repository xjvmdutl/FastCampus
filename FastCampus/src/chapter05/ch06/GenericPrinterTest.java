package chapter05.ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		//GenericPrinter<Powder> powerderPrinter = new GenericPrinter<>();//실제 들어갈 타입을 지정해준다
		GenericPrinter powerderPrinter = new GenericPrinter<>();//해당 형식으로 사용 가능하다
		//단 이는 Object로 인식하기 때문에 형변환이 필요하다.
		//warning이 많다... 잘 사용 안한다.
		powerderPrinter.setMaterial(powder);
		//object와의 차이
		Powder p = (Powder)powerderPrinter.getMaterial();//형변환이 필요 없다.
		//컴파일러가 컴파일시 다 replace해주기 때문에 형변환 필요 없다.
		System.out.println(powerderPrinter.toString());
	}

}

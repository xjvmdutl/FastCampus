package chapter05.ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter<Powder> powerderPrinter = new GenericPrinter<>();
		powerderPrinter.setMaterial(powder);
		Powder p = (Powder)powerderPrinter.getMaterial();
		System.out.println(powerderPrinter.toString());
		//������ �������� ���� �޼ҵ�� Meterial���� ����ؾ� �ȴ�.
		p.doPrinting();
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<>();//���Ұ���
		//c,c++�� Template ��ɰ� ����
	}

}

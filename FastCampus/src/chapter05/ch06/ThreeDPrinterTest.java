package chapter05.ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		printer.setMaterial(powder);//�ִ°Ŵ� ���� x
		Powder p =(Powder) printer.getMaterial();//���� //����ȯ�� �ʿ��ϴ�.
		//���ŷӱ� ������ generic ���α׷����� ���Դ�
		
	}

}

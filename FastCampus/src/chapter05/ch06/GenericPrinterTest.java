package chapter05.ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		//GenericPrinter<Powder> powerderPrinter = new GenericPrinter<>();//���� �� Ÿ���� �������ش�
		GenericPrinter powerderPrinter = new GenericPrinter<>();//�ش� �������� ��� �����ϴ�
		//�� �̴� Object�� �ν��ϱ� ������ ����ȯ�� �ʿ��ϴ�.
		//warning�� ����... �� ��� ���Ѵ�.
		powerderPrinter.setMaterial(powder);
		//object���� ����
		Powder p = (Powder)powerderPrinter.getMaterial();//����ȯ�� �ʿ� ����.
		//�����Ϸ��� �����Ͻ� �� replace���ֱ� ������ ����ȯ �ʿ� ����.
		System.out.println(powerderPrinter.toString());
	}

}

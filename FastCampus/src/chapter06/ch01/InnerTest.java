package chapter06.ch01;
class OutClass{
	private int num =10;
	private static int sNum = 20;
	private InClass inClass;
	public OutClass(){//outerŬ���� ������ inclass�� ��������� ���� ����Ѵ�.
		inClass = new InClass();
	}
	private class InClass{//private ������ ���� ����Ѵ�.
		int iNum = 100;
		//static int sInNum = 500;//���� : �ν��Ͻ� innerŬ�����̱� ������ outerŬ������ ������ �����Ǳ� ������ ����������.
		//�������� ��� �Ұ� -> ���� ����Ŭ�������� ����ؾ� �ȴ�.
		void inTest(){ 
			
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)"); 
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		void inTest(){ 
			
			//System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)"); //�ܺ�Ŭ������ ������ ������� Ŭ������ ����� ���� �ֱ� ������ 
																					//����Ŭ���� ����ƽ �޼ҵ忡�� �ܺ� Ŭ���� ������ ����� �Ұ����ϴ�
			System.out.println("InClass num = " +iNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		static void sTest() {
			//System.out.println("InClass num = " +iNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			//����Ŭ���� �ν��Ͻ� ������ ��� �Ұ��� //Ŭ������ �������� �ʾƵ� �ش� �޼ҵ尡 ����ɼ� �ֱ� ������
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass sNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
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
		//���� Ŭ������ private �� �ƴҰ�� �ܺο��� ��밡���ϴ�.
		//���������δ� �����ϳ� ���� ��� x
		//OutClass.InClass inner = outClass.new InClass();
		//inner.inTest();
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		System.out.println();
		OutClass.InStaticClass.sTest();
		//Ŭ���� ������ �����ϰ� ��밡��
		
	}
}
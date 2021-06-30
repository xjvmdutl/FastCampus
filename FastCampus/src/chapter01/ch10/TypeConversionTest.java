package chapter01.ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		/*
		byte bNum =10;
		int iNum = bNum;//아무 문제 없다.//1->4
		
		int iNum1 =20;
		float fNum = iNum1;//아무 문제 없다.//4->4
		
		iNum=10;
		iNum = (byte)iNum;//명시적형변환 필요 // 4->1
		
		double dNum = 3.14;
		int iNum2 = (int)dNum;//명시적형변환 필요 // 4->8
		*/
		/*
		int iNum = 255;//바이트 표현범위 넘어간다.//byte에 들어갈수 있는 범위면 문제 x
		byte bNum = (byte)iNum;
		System.out.println(bNum);
		
		double dNum = 3.14;
		int inum = (int)dNum;
		System.out.println(inum);//소수점 사라짐, 다운 케스팅
		*/
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;//1+0 = 1
		int iNum2 = (int)(dNum + fNum);//double+float = double
		//1.2+0.9 =2.1-> 2
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}

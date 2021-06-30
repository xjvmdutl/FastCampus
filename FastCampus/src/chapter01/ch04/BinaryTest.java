package chapter01.ch04;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;//num을 10에 대입
		int bNum = 0B1010;//0B는 뒤에나오는 숫자는 2진수라는 표기
		int oNum = 012;//0는 8진수라는걸 명시할떄 사용
		int xNum = 0XA; //0X는 16진수라는걸 명시
		// int는 32비트 이므로 앞에 0이 붙어서 표시된거랑 같다.
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}

package chapter06.ch02;

public class AddTest {

	public static void main(String[] args) {
		Add addL = (x,y) ->{//�ش� �������̽��� ������ ���̴�
			return x+y;//�������̽� ���� Ŭ������ ������ �ʰ� �ٷ� ����ߴ�
		};
		System.out.println(addL.add(2, 3));//ȣ��
		Add addR = (x,y) -> x+y;
		//���Ϲ��� �ϳ��̱� ������ �߰�ȣ�� �����Ҽ� �ִ�(�Ű������� 2���� ���� �Ұ���)
	}

}

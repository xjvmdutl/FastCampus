package chapter06.ch09;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Index �ʰ� ������ ����ų ����
		int[] arr = {1,2,3,4,5};
		try {
			for(int i=0;i<=5;++i) {//length�� 5�ε� �ε��� 5�� �����Ͽ���
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {//�ش� ������ �߻��� e��� exception�� �Ѿ�´�.
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			//toString()�� exception full-name + message�� �����Ǿ� �ִ�
		}
		System.out.println("here!!");//������� ��������� �׽�Ʈ
		//������ ���ᰡ ���� �ʾҴ�. ������ ���� �ʰ� ������ ���(�α׷� ���߿� �м��Ͽ� �ذ�)
	}

}

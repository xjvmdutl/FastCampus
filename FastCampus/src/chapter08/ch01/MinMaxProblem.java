package chapter08.ch01;

public class MinMaxProblem {

	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		int min = numbers[0];//������ ������ �ص� �ȴ�.
		//�迭�ȿ� ����� ���� �𸣱� ������ numbers[0]�ϴ°� �ո���
		int max =numbers[0];

		int minPos = 1;//0��°�� ����ũ�� �۴�
		int maxPos = 1;
		
		for(int i=1;i<numbers.length;++i) {
			if(min > numbers[i]) {
				min = numbers[i];//numbers[i]�� ����� ������ �۴�.
				minPos = i+1;//���° �̱� ������ +1 ���ش�
			}
			if(max < numbers[i]) {
				max = numbers[i];//numbers[i]�� ����� ������ ũ��.
				maxPos = i+1;
			}
		}
		System.out.println("���� ū ���� " + max + "�̰�, ��ġ�� " + maxPos + "��° �Դϴ�.");
		System.out.println("���� ���� ���� " + min + "�̰�, ��ġ�� " + minPos + "��° �Դϴ�.");

	}

}

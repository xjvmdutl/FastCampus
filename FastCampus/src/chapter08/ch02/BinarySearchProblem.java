package chapter08.ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		//������ �Ǿ� �־������ ������ Ž�� ���
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		//int target = 83;//ã������ ��
		//���°�
		int target = 88;
		int left = 0;//0��° ��ҷ� ����
		int right = numbers.length-1;//�迭 ũ�⺸�� �ϳ� ���� ��ġ�� ����
		int mid = (left + right)/2;//�߰���
		
		int temp = numbers[mid];
		boolean find = false;//ã�Ҵ��� ����
		
		while(left <= right) {//left�� right�� ���ų� Ŀ�������� �ݺ�
			//�� ���� ���� ã���� break�� ����������
			if(target == temp) {//ã�� ���̶� �߰����̶� ���ٸ�
				find = true;//ã�Ҵ�!
				break;//�ݺ��� ����
			}else if(target < temp ) {//�߰����� ã������ ������ ũ�� right ����
				right = mid -1;
			}else {//�߰����� ã������ ������ ������ left ����
				left = mid +1;
			}
			//�߰����� �׻� ������ �ش�
			mid = (left + right)/2;
			temp = numbers[mid];
		}
		if(find == true) {//ã�Ҵ�
			mid++;//���°�� +1��
			System.out.println("ã�� ���� " + mid + "��° �ֽ��ϴ�.");
		}else //��ã�Ҵ�
			System.out.println("ã�� ���� �����ϴ�.");

	}

}

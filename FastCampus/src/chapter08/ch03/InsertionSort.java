package chapter08.ch03;

public class InsertionSort {
	public static void insertionSort(int[] arr,int count) {
		int i = 0;
		int j = 0;
		int temp = 0;
		for(i=1;i<count;++i) {
			temp = arr[i];//�ϳ��� ���� ������ �´�(0������ ������ ���ֱ� ������ 1������ ���� �ȴ�)
			j=i;//j�� �ʱ⿡�� i��ġ
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];//temp�� �� ������ �ڷ� �̵�
				j = j-1;//j�� ��ĭ ������
				//j�� 0���� ũ�� temp������ Ŀ������ �ڷΰ���.
			}
			arr[j] = temp;//j��ġ�� �����͸� �ִ´�
			System.out.println("�ݺ� = "+i);
			printSort(arr,count);
		}
	}
	private static void printSort(int[] value, int count) {
		int i =0;
		for(i=0;i<count;++i) {
			System.out.print(value[i] + "\t");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {80,50,70,10,60,20,40,30};
		insertionSort(arr, 8);//�迭, ����
	}

}

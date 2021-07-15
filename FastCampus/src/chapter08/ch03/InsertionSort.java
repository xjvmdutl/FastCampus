package chapter08.ch03;

public class InsertionSort {
	public static void insertionSort(int[] arr,int count) {
		int i = 0;
		int j = 0;
		int temp = 0;
		for(i=1;i<count;++i) {
			temp = arr[i];//하나의 값을 가지고 온다(0번쨰는 정렬이 되있기 때문에 1번부터 돌면 된다)
			j=i;//j가 초기에는 i위치
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];//temp가 더 작으면 뒤로 이동
				j = j-1;//j는 한칸 앞으로
				//j가 0보다 크고 temp값보다 커야지만 뒤로간다.
			}
			arr[j] = temp;//j위치에 데이터를 넣는다
			System.out.println("반복 = "+i);
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
		insertionSort(arr, 8);//배열, 갯수
	}

}

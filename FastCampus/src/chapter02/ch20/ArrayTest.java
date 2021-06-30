package chapter02.ch20;

public class ArrayTest {

	public static void main(String[] args) {
		//int[] arr = new int[10];//10개짜리 배열선언
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};//이렇게 사용 가능
		int total = 0;
//		for(int i=0, num=1;i<arr.length;i++) {
//			//System.out.println(arr[i]);//배열은 new 하게 되면 default로 초기화가 된다.
//			arr[i] = num++;//num을 대입후 증가
//		}
		
		for(int num : arr) {//향상된 for문 : 처음부터 끝까지 다순회할때 사용
			total += num;//해당 num에 배열 요소가 하나씩 들어간다.
		}
		System.out.println(total);
	}

}

package chapter08.ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		//정렬이 되어 있어야지만 가능한 탐색 기법
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		//int target = 83;//찾으려는 값
		//없는값
		int target = 88;
		int left = 0;//0번째 요소로 세팅
		int right = numbers.length-1;//배열 크기보다 하나 작은 위치로 세팅
		int mid = (left + right)/2;//중간값
		
		int temp = numbers[mid];
		boolean find = false;//찾았는지 여부
		
		while(left <= right) {//left가 right랑 같거나 커질떄까지 반복
			//그 전에 값을 찾으면 break로 빠져나간다
			if(target == temp) {//찾는 값이랑 중간값이랑 같다면
				find = true;//찾았다!
				break;//반복문 중지
			}else if(target < temp ) {//중간값이 찾으려는 값보다 크면 right 조정
				right = mid -1;
			}else {//중간값이 찾으려는 값보다 작으면 left 조정
				left = mid +1;
			}
			//중간값을 항상 갱신해 준단
			mid = (left + right)/2;
			temp = numbers[mid];
		}
		if(find == true) {//찾았다
			mid++;//몇번째라서 +1값
			System.out.println("찾는 수는 " + mid + "번째 있습니다.");
		}else //못찾았다
			System.out.println("찾는 수가 없습니다.");

	}

}

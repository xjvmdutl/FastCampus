package chapter05.ch02;

public class MyArray {
	int[] intArr;//배열
	int count; //Element 갯수,용량(모두 쓰진 않는다)
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM= -99999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	public MyArray(int size) {//오버 로딩
		count =0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	public void insertElement(int position,int num) {
		//position은 0부터 시작한다.
		//맨 끝 요소부터 하나씩 옮긴뒤 빈 자리에 num을 넣으면 된다.
		//마지막 위치에서 부터 position위치 까지 이동한뒤 position자리에 데이터를 넣어주면 된다.
		int i;
		if(position < 0 || position > count) {//오류 조건
			System.out.println("insert Error");
			return;
		}
		if(count >= ARRAY_SIZE) {//배열이 꽉찰을 경우
			System.out.println("not enough memory");
			return;
		}
		for(i =count-1; i>=position;--i) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		if(isEmpty()) {//배열이 비어 있다
			System.out.println("Array is empty");
			return ret;
		}
		if(position < 0 || position > count-1) {//삭제 하려는 위치가 0이하익거나 element갯수 이상일 경우 에러
			System.out.println("remove Error");
			return ret;
		}
		ret = intArr[position];
		for(int i = position; i<count-1;++i) {
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		if(count == 0 )
			return true;
		else return false;
	}
	public int getElement(int position) {
		if(position < 0 || position > count-1) {
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	public void printAll() {
		if(count ==0) {
			if(count == 0){
				System.out.println("출력할 내용이 없습니다.");
				return;
			}
		}
		for(int i=0;i<count;++i)
			System.out.println(intArr[i]);
	}
	public void removeAll() {
		for(int i=0;i<count;++i) {
			intArr[i] = 0;
		}
		count = 0;
	}
}

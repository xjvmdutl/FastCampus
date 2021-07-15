package chapter08.ch03;

public class HeapSort {
	private int SIZE;
	private int[] heapArr;
	
	public HeapSort() {
		SIZE = 0;
		heapArr = new int[50];
	}
	
	public void insertHeap(int input) {
		int i = ++SIZE;
		//minHeap과 maxHeap의 데이터 넣는 방식만 다르다.
		//while(i != 1 && input > heapArr[i/2]){//maxHeap
		while(i != 1 && input < heapArr[i/2]){//minHeap
			//지금 들어가려는 숫자가 부모보다 작으면 부모를 내리고 위로 올라간다
			heapArr[i] = heapArr[i/2];//부모를 내린다.
			i=i/2;//위치를 부모위치로 이동
			//맨위로 가거나 더 작은수를 만날때까지 이동한다.
		}
		heapArr[i] = input;//i위치가 정해지면 해당 위치에 input을 넣는다
		//수행 속도 O(log2N)
	}
	
	public int getHeapSize() {
		return SIZE;
	}
	
	public int deleteHeap() {
		//root를 삭제 후 가장 마지막 node를 맨위로 올린다.
		//그 후, 밑으로 내려가면서 작은 수와 비교해 나가면서 swap을 진행한다.
		int parent;
		int child;
		int data;
		int temp;
		data = heapArr[1];//root데이터를 리턴한다.
		
		temp = heapArr[SIZE];//temp위치를 while문으로 정해준다,가장 마지막 데이터
		SIZE -= 1;
		parent = 1;//temp가 들어갈 위치
		child = 2;
		while(child <= SIZE) {
			//if(child < SIZE && heapArr[child] < heapArr[child+1]) { //maxHeap
			if(child < SIZE && heapArr[child] > heapArr[child+1]) { //minHeap
				child++;
				//자식노드의 형재노드를 비교해서 더 작은값을 선택해 준다.
			}
			//if(temp >= heapArr[child]) break; //maxHeap
			if(temp <= heapArr[child]) break; //minHeap
			//temp가 더 작으면 더이상 돌 필요가 없다
			heapArr[parent] = heapArr[child];//부모에 자식을 오리고
			parent = child;//parent를 child로 세팅
			child *= 2;//자식요소를 업데이트
		}
		heapArr[parent] = temp;
		return data;
	}
	
	public void printHeap(){ 
		//System.out.printf("\n Max Heap : "); 
		System.out.printf("\n Min Heap : ");
		for(int i=1; i<=SIZE; i++)
			System.out.printf("[%d] ", heapArr[i]);
	}
	public static void main(String[] args) {
		HeapSort h = new HeapSort();
		h.insertHeap(80);
		h.insertHeap(50);
		h.insertHeap(70);
		h.insertHeap(10);
		h.insertHeap(60);
		h.insertHeap(20);
		
		h.printHeap();
		
		int n;
		int data;
		n = h.getHeapSize();
		for(int i=1;i<=n;++i) {
			data = h.deleteHeap();
			System.out.println("출력 : ["+data+"]");
		}
	}

}

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
		//minHeap�� maxHeap�� ������ �ִ� ��ĸ� �ٸ���.
		//while(i != 1 && input > heapArr[i/2]){//maxHeap
		while(i != 1 && input < heapArr[i/2]){//minHeap
			//���� ������ ���ڰ� �θ𺸴� ������ �θ� ������ ���� �ö󰣴�
			heapArr[i] = heapArr[i/2];//�θ� ������.
			i=i/2;//��ġ�� �θ���ġ�� �̵�
			//������ ���ų� �� �������� ���������� �̵��Ѵ�.
		}
		heapArr[i] = input;//i��ġ�� �������� �ش� ��ġ�� input�� �ִ´�
		//���� �ӵ� O(log2N)
	}
	
	public int getHeapSize() {
		return SIZE;
	}
	
	public int deleteHeap() {
		//root�� ���� �� ���� ������ node�� ������ �ø���.
		//�� ��, ������ �������鼭 ���� ���� ���� �����鼭 swap�� �����Ѵ�.
		int parent;
		int child;
		int data;
		int temp;
		data = heapArr[1];//root�����͸� �����Ѵ�.
		
		temp = heapArr[SIZE];//temp��ġ�� while������ �����ش�,���� ������ ������
		SIZE -= 1;
		parent = 1;//temp�� �� ��ġ
		child = 2;
		while(child <= SIZE) {
			//if(child < SIZE && heapArr[child] < heapArr[child+1]) { //maxHeap
			if(child < SIZE && heapArr[child] > heapArr[child+1]) { //minHeap
				child++;
				//�ڽĳ���� �����带 ���ؼ� �� �������� ������ �ش�.
			}
			//if(temp >= heapArr[child]) break; //maxHeap
			if(temp <= heapArr[child]) break; //minHeap
			//temp�� �� ������ ���̻� �� �ʿ䰡 ����
			heapArr[parent] = heapArr[child];//�θ� �ڽ��� ������
			parent = child;//parent�� child�� ����
			child *= 2;//�ڽĿ�Ҹ� ������Ʈ
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
			System.out.println("��� : ["+data+"]");
		}
	}

}

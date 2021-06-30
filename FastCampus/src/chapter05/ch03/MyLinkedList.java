package chapter05.ch03;

public class MyLinkedList {
	private MyListNode head;
	int count; 
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	//�� �տ� �ִ��� Ȯ���� �ѵ� ������� �տ� �־��ְ� �ƴҰ��(�߰�����) ���� ��带 ã���� ������ ���ص�
	public MyListNode addElement(String data) {
		MyListNode newNode;
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}else {
			//������ ��尡 ����Ű�� ��Ҵ� null�� �ȴ�.
			newNode = new MyListNode(data);
			MyListNode temp = head;//head����(ù��°���) ���鼭 ã�����̴�.
			while(temp.next != null) {
				temp = temp.next;//������ ��ұ��� ã�ư���.
			}
			temp.next = newNode;
			
		}
		count++;
		return newNode;
	}
	public MyListNode insertElement(int position,String data) {//�߰� ����
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		MyListNode newNode = new MyListNode(data);
		if(position < 0 || position > count) {
			System.out.println("�߰� �� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		if(position == 0) {//�� �� ����
			newNode.next = head;//head�� newNode�� �������� �ǰ�
			head = newNode;
		}else {
			for(i=0;i<position;++i) {
				preNode = tempNode;//������� ����Ҹ� ��� ã�´�
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		if(position >= count ){
			System.out.println("���� �� ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null; 
		}
		if(position == 0) {//�� �� ���� , head�� head�� ���� ��Ҹ� ����Ű�� �Ѵ�.
			head = tempNode.next;
		}else {
			for(i=0;i<position;++i) {
				preNode = tempNode;//������� ����Ҹ� ��� ã�´�
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}
	public void printAll() {
		if(count == 0){ 
			System.out.println("����� ������ �����ϴ�."); 
			return; 
		} 
		MyListNode temp = head; 
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){ 
				System.out.print("->"); 
			}
		}
		System.out.println();
	}
	public int getSize() {
		return count;
	}
	public void removeAll() {//�ڹ� ������ �÷��Ͱ� �˾Ƽ� �����ش�
		head = null; 
		count = 0;
	}
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false; 
	}
	public String getElement(int position) {
		int i; 
		MyListNode tempNode = head; 
		if(position >= count ){ 
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return new String("error"); 
		}
		if(position == 0){ //�� �� ��� 
			return head.getData();
		} 
		for(i=0;i<position;++i) {
			tempNode = tempNode.next;
		}
			
		return tempNode.getData();
	}
	public MyListNode getNode(int position) { 
		int i; 
		MyListNode tempNode = head; 
		if(position >= count ){
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null; 
		}
		if(position == 0){ //�� �� ��� return head;
			return head;
		}
		for(i=0;i<position;++i) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
}

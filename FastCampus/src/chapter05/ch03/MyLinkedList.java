package chapter05.ch03;

public class MyLinkedList {
	private MyListNode head;
	int count; 
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	//맨 앞에 넣는지 확인을 한뒤 맞을경우 앞에 넣어주고 아닐경우(중간삽입) 이전 노드를 찾은뒤 연결을 해준디
	public MyListNode addElement(String data) {
		MyListNode newNode;
		if(head == null) {
			newNode = new MyListNode(data);
			head = newNode;
		}else {
			//마지막 노드가 가리키는 요소는 null이 된다.
			newNode = new MyListNode(data);
			MyListNode temp = head;//head부터(첫번째요소) 돌면서 찾을것이다.
			while(temp.next != null) {
				temp = temp.next;//마지막 요소까지 찾아간다.
			}
			temp.next = newNode;
			
		}
		count++;
		return newNode;
	}
	public MyListNode insertElement(int position,String data) {//중간 삽입
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		MyListNode newNode = new MyListNode(data);
		if(position < 0 || position > count) {
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		if(position == 0) {//맨 앞 삽입
			newNode.next = head;//head가 newNode을 다음값이 되고
			head = newNode;
		}else {
			for(i=0;i<position;++i) {
				preNode = tempNode;//집어넣을 전요소를 계속 찾는다
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
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null; 
		}
		if(position == 0) {//맨 앞 삭제 , head가 head의 다음 요소를 가리키게 한다.
			head = tempNode.next;
		}else {
			for(i=0;i<position;++i) {
				preNode = tempNode;//집어넣을 전요소를 계속 찾는다
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		return tempNode;
	}
	public void printAll() {
		if(count == 0){ 
			System.out.println("출력할 내용이 없습니다."); 
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
	public void removeAll() {//자바 가비지 컬렉터가 알아서 지워준다
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
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error"); 
		}
		if(position == 0){ //맨 인 경우 
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
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null; 
		}
		if(position == 0){ //맨 인 경우 return head;
			return head;
		}
		for(i=0;i<position;++i) {
			tempNode = tempNode.next;
		}
		return tempNode;
	}
}

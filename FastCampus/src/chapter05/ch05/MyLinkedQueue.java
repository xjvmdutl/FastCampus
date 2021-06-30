package chapter05.ch05;

import chapter05.ch03.MyLinkedList;
import chapter05.ch03.MyListNode;


public class MyLinkedQueue extends MyLinkedList implements Queue{
	//LinkedList로 구현한다.
	
	MyListNode front;
	MyListNode rear;
	//삽입 삭제는 linkedlist에 구현이 되어 있으니 front rear만 사용하면 된다.
	public MyLinkedQueue()
	{
		front = null;
		rear = null;
	}

	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {//비어져 있는지 확인
			newNode=addElement(data);//addElement에서 생성을 알아서 해준다.
			front = newNode;
			rear = newNode;
		}else {//맨뒤로 들어가는경우
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
		
	}

	public String deQueue() {
		if(isEmpty()) {//비어져 있는지 확인
			return null;
		}
		String data = front.getData();
		//front,rear다시 설정
		front = front.next;
		if(front == null) {//마지막 항목이라는 뜻이다. //rear도 초기화
			rear = null;
		}
		return data;
	}

	public void printQueue() {
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData() + ",");
			temp = temp.next;
		}
		System.out.println();

	}
	
	
}

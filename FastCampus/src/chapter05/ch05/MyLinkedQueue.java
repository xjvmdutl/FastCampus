package chapter05.ch05;

import chapter05.ch03.MyLinkedList;
import chapter05.ch03.MyListNode;


public class MyLinkedQueue extends MyLinkedList implements Queue{
	//LinkedList�� �����Ѵ�.
	
	MyListNode front;
	MyListNode rear;
	//���� ������ linkedlist�� ������ �Ǿ� ������ front rear�� ����ϸ� �ȴ�.
	public MyLinkedQueue()
	{
		front = null;
		rear = null;
	}

	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {//����� �ִ��� Ȯ��
			newNode=addElement(data);//addElement���� ������ �˾Ƽ� ���ش�.
			front = newNode;
			rear = newNode;
		}else {//�ǵڷ� ���°��
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
		
	}

	public String deQueue() {
		if(isEmpty()) {//����� �ִ��� Ȯ��
			return null;
		}
		String data = front.getData();
		//front,rear�ٽ� ����
		front = front.next;
		if(front == null) {//������ �׸��̶�� ���̴�. //rear�� �ʱ�ȭ
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

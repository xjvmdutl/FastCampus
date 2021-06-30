package chapter05.ch04;

import chapter05.ch02.MyArray;

public class MyArrayStack {
	MyArray arrayStack;
	int top;//���� //0���� �ڵ� �ʱ�ȭ
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	public MyArrayStack(int size) {//size�� �������
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {//����Ÿ ����
		//arraylist�� �����Ͱ� ������ Ȯ���ؾ��Ѵ�.
		if(isFull()) {//stack �� �� �����
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	public int pop() {
		//�����Ͱ� ����� �ִ��� Ȯ��
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;//���� �ѹ��� ����
		}
		
		return arrayStack.removeElement(--top);//���� �� top-1�� �ִ� �����͸� ������.
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;//���� �ѹ��� ����
		}
		
		return arrayStack.getElement(top-1);//top��ġ�� ��Ҹ� ������ �´�.
	}
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(top == 0) {//�����Ͱ� ����
			
			return true;
		}else {
			return false;
		}
	}
	public void printAll() {
		arrayStack.printAll();
	}
}

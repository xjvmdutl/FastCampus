package chapter05.ch04;

import chapter05.ch02.MyArray;

public class MyArrayStack {
	MyArray arrayStack;
	int top;//맨위 //0으로 자동 초기화
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	public MyArrayStack(int size) {//size가 있을경우
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {//데이타 삽입
		//arraylist는 데이터가 꽉찬지 확인해야한다.
		if(isFull()) {//stack 이 다 찰경우
			System.out.println("stack is full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	public int pop() {
		//데이터가 비어져 있는지 확인
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;//에러 넘버를 리턴
		}
		
		return arrayStack.removeElement(--top);//감소 후 top-1에 있는 데이터를 꺼낸다.
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;//에러 넘버를 리턴
		}
		
		return arrayStack.getElement(top-1);//top위치을 요소를 가지고 온다.
	}
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(top == 0) {//데이터가 없다
			
			return true;
		}else {
			return false;
		}
	}
	public void printAll() {
		arrayStack.printAll();
	}
}

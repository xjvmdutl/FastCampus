package chapter03.ch15;

public interface Queue {
	void enQueue(String title);//데이터 넣기
	String deQueue();//책 반환
	int getSize();//queue 데이터 확인
}

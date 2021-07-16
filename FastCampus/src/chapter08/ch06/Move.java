package chapter08.ch06;

public class Move {
	int direction = 0; //동,서,남,북을 저장할 변수
	
	public int x = 0;
	public int y = 0;
	public Move(int x,int y) {
		this.x = x;
		this.y = y;
	}
}

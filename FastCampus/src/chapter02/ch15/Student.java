package chapter02.ch15;

public class Student {
	String studentName;//¿Ã∏ß
	int money;//µ∑
	public Student(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeTex(Tex tex, int money) {
		this.money -= money;
		tex.take(money);
	}
	public void showInfo() {
		System.out.println(studentName + "¥‘¿« ≥≤¿∫ µ∑¿∫ "+ money +"ø¯ ¿‘¥œ¥Ÿ.");
	}
}

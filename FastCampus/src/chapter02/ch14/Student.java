package chapter02.ch14;

public class Student {
	String studentName;//이름
	int money;//돈
	public Student(String studentName,int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) {//학생이 버스를 탄다
		bus.take(1000);//ctrl + 마우스 왼쪽 클릭 = 객체 메소드 이동
		this.money -= 1000;
	}
	public void takeSubway(Subway subway) {//학생이 지하철를 탄다
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 "+ money +"원 입니다.");
	}
}

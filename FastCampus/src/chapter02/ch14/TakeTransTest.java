package chapter02.ch14;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);//버스는 여러개가 있을수 있다.
		Bus bus500 = new Bus(500);//버스의 인스턴스가 여러개중 매개변수로 넘어가느 버스를 의미한다.
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);//subway 또한 인스턴스가 여러개일수 있다.
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
		bus500.showBusInfo();//아무것도 안했기떄문에 default값
	}

}

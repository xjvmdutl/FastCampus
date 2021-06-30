package chapter02.ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();//싱글톤 패턴으로 구현
        Car mySonata = factory.createCar();//이 메소드로 생성
        Car yourSonata = factory.createCar(); 
        System.out.println(mySonata);
        System.out.println(yourSonata);
        System.out.println(mySonata.getCarNum()); //10001 출력 
		System.out.println(yourSonata.getCarNum()); //10002 출력 
	}

}

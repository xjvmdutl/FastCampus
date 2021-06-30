package chapter02.ch19;

public class Car {
	private int carNum;
	private static int carSerialNum = 10000;
	public Car() {
		this.carNum = ++carSerialNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
}

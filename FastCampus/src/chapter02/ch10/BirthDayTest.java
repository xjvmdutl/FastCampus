package chapter02.ch10;

public class BirthDayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay date = new BirthDay();
		date.setYear(2019);//private변수는 보이지 않는다.
		//date.setMonth(13);
		date.setMonth(12);
		/*
		 * date.month = 100; private가 아닐경우 변수에 이렇게 값을 대입할수 있다. 
		 * 맴버 변수의 오류를 범해질수 있고 객체가 잘못 사용될수 있다.
		 * get,set 메소드가 존재하면 데이터을 쓸데없는 값을 대입을 차단할수 있다.
		 * */
		date.setDay(30);
		date.showDate();
	}

}

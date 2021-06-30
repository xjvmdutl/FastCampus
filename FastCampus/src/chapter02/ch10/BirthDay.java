package chapter02.ch10;

public class BirthDay {
	private int day; //private 접근 제어자 : 외부에서 접근이 불가능//get,set메소드 작성해야한다.
	private int month;
	private int year;
	//private 로 선언하므로서 데이터을 오용을 막을수가 있다.
	private boolean isValid; // default : false
	
	public int getDay() {
		//윤년이나 , 해당월을 값을 정확하게 넣을수 있다.
		return day;
	}
	public void setDay(int day) {//getter, setter 메소드 명을 다르게 써도 되지만 규칙적으로 이렇게 사용
		this.day = day;
	}
	//마우스 오른쪽 -> source -> generate getter and setter 를 눌러 자동으로 만들어 줄수 있다.
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {//달은 1 ~ 12월 까지 존재 해야하므로 다른값이 들어오면 대입하면 x
		if(month < 1 || month >12) {//1~12월이 아니면
			isValid = false;
		}else {//유효한 날짜가 되었다고 isvalid를 true로 해야된다
			isValid = true;
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void showDate() {
		if(isValid) {//존재 하는 날짜이다
			System.out.println(year + "년 "+month+"월 "+day+"일 입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	public boolean getIsValid() {//isValid 같은경우는 클래스 내부로직에서 값을 정의하기 떄문에 set메소드는 만들필요가 없다.
		return isValid;//정보 은닉

	}
}

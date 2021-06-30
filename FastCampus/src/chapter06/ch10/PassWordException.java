package chapter06.ch10;

public class PassWordException extends Exception{//Runtime Exception,arguments 오류일때 발생
	public PassWordException(String message) {
		super(message);
	}
}

package chapter06.ch09;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoClosableObj obj = new AutoClosableObj();
		
		try(obj){
			throw new Exception();//강제 오류 발생
		}catch(Exception e) {
			System.out.println("exception");
		}
		//try-catch문이 실행이 되면 Autoclose가 실행된다
		System.out.println("end");
	}

}

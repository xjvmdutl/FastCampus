package chapter06.ch09;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoClosableObj obj = new AutoClosableObj();
		
		try(obj){
			throw new Exception();//���� ���� �߻�
		}catch(Exception e) {
			System.out.println("exception");
		}
		//try-catch���� ������ �Ǹ� Autoclose�� ����ȴ�
		System.out.println("end");
	}

}

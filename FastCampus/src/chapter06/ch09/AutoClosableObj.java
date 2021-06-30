package chapter06.ch09;

public class AutoClosableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {//해당 메소드에서 소켓을 닫거나 자원을 닫는다
		System.out.println("close....");
	}

}

package chapter06.ch09;

public class AutoClosableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {//�ش� �޼ҵ忡�� ������ �ݰų� �ڿ��� �ݴ´�
		System.out.println("close....");
	}

}

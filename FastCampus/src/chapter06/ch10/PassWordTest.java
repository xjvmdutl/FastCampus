package chapter06.ch10;

public class PassWordTest {
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException{
		//���⼭ ���� ó��
		if(password == null) {
			//����� ���� exception
			throw new PassWordException("��й�ȣ�� null�� �� �����ϴ�.");
		}else if(password.length() < 5) {
			throw new PassWordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
		}else if(password.matches("[a-zA-Z]+")) {//����θ� �̷���� ��� ���Խ�
			throw new PassWordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		PassWordTest test = new PassWordTest();
		String password = null;
		try {
			//IllegalAgumentExcption�� ��Ÿ�ӽ� Exception���� �����Ͻ� ������ ���� �ʾƼ� ����
			test.setPassword(password);
			System.out.println("��������!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		password = "abc";
		try {
			//IllegalAgumentExcption�� ��Ÿ�ӽ� Exception���� �����Ͻ� ������ ���� �ʾƼ� ����
			test.setPassword(password);
			System.out.println("��������!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcde";
		try {
			//IllegalAgumentExcption�� ��Ÿ�ӽ� Exception���� �����Ͻ� ������ ���� �ʾƼ� ����
			test.setPassword(password);
			System.out.println("��������!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcde!#";
		try {
			//IllegalAgumentExcption�� ��Ÿ�ӽ� Exception���� �����Ͻ� ������ ���� �ʾƼ� ����
			test.setPassword(password);
			System.out.println("��������!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
	}

}

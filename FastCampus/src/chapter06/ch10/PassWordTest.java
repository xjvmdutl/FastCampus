package chapter06.ch10;

public class PassWordTest {
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException{
		//여기서 예외 처리
		if(password == null) {
			//사용자 정의 exception
			throw new PassWordException("비밀번호는 null일 수 없습니다.");
		}else if(password.length() < 5) {
			throw new PassWordException("비밀번호는 5자 이상이어야 합니다.");
		}else if(password.matches("[a-zA-Z]+")) {//영어로만 이루어질 경우 정규식
			throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}

	public static void main(String[] args) {
		PassWordTest test = new PassWordTest();
		String password = null;
		try {
			//IllegalAgumentExcption은 런타임시 Exception으로 컴파일시 에러가 나지 않아서 변경
			test.setPassword(password);
			System.out.println("오류없음!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		password = "abc";
		try {
			//IllegalAgumentExcption은 런타임시 Exception으로 컴파일시 에러가 나지 않아서 변경
			test.setPassword(password);
			System.out.println("오류없음!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcde";
		try {
			//IllegalAgumentExcption은 런타임시 Exception으로 컴파일시 에러가 나지 않아서 변경
			test.setPassword(password);
			System.out.println("오류없음!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcde!#";
		try {
			//IllegalAgumentExcption은 런타임시 Exception으로 컴파일시 에러가 나지 않아서 변경
			test.setPassword(password);
			System.out.println("오류없음!");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
	}

}

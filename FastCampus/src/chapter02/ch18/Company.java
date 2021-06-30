package chapter02.ch18;

public class Company {
	//회사라는 객체는 유일해야 한다.
	//컴파일러가 default생성자를 만들기 때문에 외부에서 company를 여러개 만들수 있다
	private static Company instance = new Company();//유일한 객체가 된다.
	//외부에서 생성자를 new 할수 없도록 private로 선언
	//컴파일러는 생성자를 만들어 주지 않는다.
	private Company() {
		
	}
	//유일한 객체를 외부에서 쓰게끔 해야한다.
	public static Company getInstance() {//외부에서 클래스 이름으로 접근 가능하게 static 선언
		if(instance == null) {
			instance = new Company();//방어적 코드
		}
		return instance;
	}
	
}

package chapter02.ch12;

public class Person {
	String name;
	int age;
	
	public Person() {//디폴트 생성자
		/*
		 * int num = 10; 
		 * name = "test";
		 */
		//해당 코드 는 불가능 why? 생성 되는것이 먼저 실행되고 해야된다(this 키워드 밑에 존재 해야한다)
		
		//아무 값도 없을때 초기화를 하고 싶을 경우 사용
		this("no name", 1);//밑에 생성자가 실행된다.
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void showPerson() {
		System.out.println(name+","+age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	//테스트 코드를 따로만들지 않고 Person 클래스 에 만드는 예제
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);// 클래스fullname.jvm이 asign 한 주소값
		Person person2 = person.getPerson();
		System.out.println(person2);//person 과 person2는 같다 = this와 참조변수 값이 같다는걸 증명
	}
}

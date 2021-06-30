package chapter02.ch08;

public class PersonTest {

	public static void main(String[] args) {
		Person personJun = new Person();
		personJun.setHeight(180);
		personJun.setWeight(78);
		personJun.setName("Tomas");
		personJun.setAge(37);
		System.out.println(personJun.personInfo());
	}

}

package chapter03.ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void eating() {//이 메소드는 모두 사용할수 있다. 다형성
		//다형성 : 다른클래스들이 보여지는것은 하나이지만 다양하게 사용이 가능하다.
		
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		//위 클래스들을 돌려보기 위한 테스트 메소드
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		for(Animal animal : animalList) {
			animal.move();//어떤 animal이냐에 따라서 다르게 동작한다.
		}
	}
	public void moveAnimal(Animal animal) {
		//코드는 한줄이지만 어떤 데이터 형이 들어가는냐에 따라 move을 동작이 달라진다.
		//하위 클래스로 형변환이 일어난다.
		//하위 클래스를 상위클래스 하나로 핸들링 할 수 있다.
		//상위클래스를 바꾸게 되면 하위클래스가 바뀔 수 있기 때문에 조심해서 사용해야한다.	
		animal.move();
		//단, human,tiger들이 가진 고유 메소드는 사용불가능
		
	}

}

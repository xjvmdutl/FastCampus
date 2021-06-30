package chapter03.ch08;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void eating() {
		
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
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		AnimalTest animalTest = new AnimalTest();
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		for(Animal animal : animalList) {
			animal.move();
		}
		
		animalTest.testDownCasting(animalList);
	}
	public void moveAnimal(Animal animal) {
		animal.move();		
	}
	public void testDownCasting(ArrayList<Animal> list) {
		//리스트를 하나씩 꺼내면서 다운 캐스팅을 진행한다.
		for(int i = 0 ;i<list.size();++i) {
			Animal animal = list.get(i);
			if(animal instanceof Human) {
				Human human  = (Human)animal;
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger  = (Tiger)animal;
				tiger.eating();
			}else if(animal instanceof Eagle) {
				Eagle eagle  = (Eagle)animal;
				eagle.flying();
			}else {//다른게 올경우
				System.out.println("unsupported type");
			}
			//할수 있다면 override를 써서 구현하는게 코드가 깔끔하다.
		}
	}
}

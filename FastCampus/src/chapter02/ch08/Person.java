package chapter02.ch08;

public class Person {
	private int height;
	private int weight;
	private String name;
	private int age;
	public String personInfo() {
		return "키가 "+height+"이고, 몸무게가 "+weight+"킬로인 남성이 있습니다. 이름은 "+ name+"이고 나이는 "+age+"세 입니다.";
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

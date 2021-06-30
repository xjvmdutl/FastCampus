package chapter05.ch07;

public class GenericPrinter<T extends Meterial> {//Meterial을 상속한 것들만 T자료형에 들어올수 있다.
	//자료형을 제한을 둔다.
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}

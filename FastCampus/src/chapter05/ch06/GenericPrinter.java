package chapter05.ch06;

public class GenericPrinter<T> {//T�� ���׸� Ÿ�� ǥ��
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

package chapter05.ch07;

public class GenericPrinter<T extends Meterial> {//Meterial�� ����� �͵鸸 T�ڷ����� ���ü� �ִ�.
	//�ڷ����� ������ �д�.
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

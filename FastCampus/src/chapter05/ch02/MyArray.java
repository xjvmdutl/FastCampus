package chapter05.ch02;

public class MyArray {
	int[] intArr;//�迭
	int count; //Element ����,�뷮(��� ���� �ʴ´�)
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM= -99999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	public MyArray(int size) {//���� �ε�
		count =0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	public void insertElement(int position,int num) {
		//position�� 0���� �����Ѵ�.
		//�� �� ��Һ��� �ϳ��� �ű�� �� �ڸ��� num�� ������ �ȴ�.
		//������ ��ġ���� ���� position��ġ ���� �̵��ѵ� position�ڸ��� �����͸� �־��ָ� �ȴ�.
		int i;
		if(position < 0 || position > count) {//���� ����
			System.out.println("insert Error");
			return;
		}
		if(count >= ARRAY_SIZE) {//�迭�� ������ ���
			System.out.println("not enough memory");
			return;
		}
		for(i =count-1; i>=position;--i) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		if(isEmpty()) {//�迭�� ��� �ִ�
			System.out.println("Array is empty");
			return ret;
		}
		if(position < 0 || position > count-1) {//���� �Ϸ��� ��ġ�� 0�����Ͱų� element���� �̻��� ��� ����
			System.out.println("remove Error");
			return ret;
		}
		ret = intArr[position];
		for(int i = position; i<count-1;++i) {
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		if(count == 0 )
			return true;
		else return false;
	}
	public int getElement(int position) {
		if(position < 0 || position > count-1) {
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	public void printAll() {
		if(count ==0) {
			if(count == 0){
				System.out.println("����� ������ �����ϴ�.");
				return;
			}
		}
		for(int i=0;i<count;++i)
			System.out.println(intArr[i]);
	}
	public void removeAll() {
		for(int i=0;i<count;++i) {
			intArr[i] = 0;
		}
		count = 0;
	}
}

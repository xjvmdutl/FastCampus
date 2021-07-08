package chapter06.ch23;

import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibrary() {
		shelf.add("�¹���1");
		shelf.add("�¹���2");
		shelf.add("�¹���3");
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		//�� �� å�� ��������.
		Thread t = Thread.currentThread();
		//Wait
		while(shelf.size() == 0) {
			//��ٸ��� �Ѵ�.
			System.out.println(t.getName() + " waiting start");
			wait();//object�� �޼ҵ��̱� ������ ��� Ŭ�������� ��밡���ϴ�
			//�ش� �޼ҵ带 �����ϰ� �ִ� �����带 run able���·� ���ش�.
			System.out.println(t.getName() + " waiting end");
			 
		}
		
		
		if(shelf.size() > 0) {
			String book = shelf.remove(0);//�ڿ��� ��� ������ ����.
			System.out.println(t.getName() + ": "+book+ " lend");
			return book;
		}else {
			return null;
		}
	}
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		//notify();//object�޼ҵ��̰� wait���¸� ����� ���ش�
		notifyAll();//�̰� ����� �����Ѵ�.
		
		System.out.println(t.getName() + ": "+book+ " return");
	}
}

class Student extends Thread{
	public Student(String name) {
		super(name);
	}
	public void run() {
		try {
			String title = LibraryMain.library.lendBook();
			if(title == null) {
				System.out.println(getName() + " ������ ������");
				return;
			}
			sleep(5000);//�����µ� 5��
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class LibraryMain {
	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		Student std1 = new Student("std1");
		Student std2 = new Student("std2");
		Student std3 = new Student("std3");
		Student std4 = new Student("std4");
		Student std5 = new Student("std5");
		Student std6 = new Student("std6");
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start();
	}

}

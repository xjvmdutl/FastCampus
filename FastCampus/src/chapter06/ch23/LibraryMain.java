package chapter06.ch23;

import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibrary() {
		shelf.add("태백산맥1");
		shelf.add("태백산맥2");
		shelf.add("태백산맥3");
		
	}
	
	public synchronized String lendBook() throws InterruptedException {
		//맨 앞 책을 빌려간다.
		Thread t = Thread.currentThread();
		//Wait
		while(shelf.size() == 0) {
			//기다리게 한다.
			System.out.println(t.getName() + " waiting start");
			wait();//object의 메소드이기 때문에 모든 클래스에서 사용가능하다
			//해당 메소드를 실행하고 있는 쓰레드를 run able상태로 해준다.
			System.out.println(t.getName() + " waiting end");
			 
		}
		
		
		if(shelf.size() > 0) {
			String book = shelf.remove(0);//자원이 없어서 에러가 나낟.
			System.out.println(t.getName() + ": "+book+ " lend");
			return book;
		}else {
			return null;
		}
	}
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		
		shelf.add(book);
		//notify();//object메소드이고 wait상태를 벗어나게 해준다
		notifyAll();//이걸 쓰라고 권장한다.
		
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
				System.out.println(getName() + " 빌리지 못했음");
				return;
			}
			sleep(5000);//빌리는데 5초
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

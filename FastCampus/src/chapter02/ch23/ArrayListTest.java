package chapter02.ch23;

import java.util.ArrayList;

import chapter02.ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		//ArrayList 클래스 API 사용
		ArrayList<Book> library = new ArrayList<>();//어떤 객체를 넣을건지 지정해야한다.
		//해당 API을 위치를 알려주어야 한다(import)
		//API 를 보고 싶을때는 해당 클래스의 f1을 눌러서 본다
		
		library.add(new Book("태백산맥1 ","조정례"));//객체를 생성해서 넣어야 한다.
		library.add(new Book("태백산맥2 ","조정례"));
		library.add(new Book("태백산맥3 ","조정례"));
		library.add(new Book("태백산맥4 ","조정례"));
		library.add(new Book("태백산맥5 ","조정례"));
		//초기 사이즈를 지정하지 않으면 10개를 생성하고 크기를 차츰 늘린다.
		for(int i = 0;i<library.size();++i) {//length가 아니다
			library.get(i).showInfo();
		}
	}

}

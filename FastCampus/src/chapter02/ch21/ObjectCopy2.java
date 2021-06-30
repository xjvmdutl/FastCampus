package chapter02.ch21;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];//복사할 배열
		library[0] = new Book("태백산맥1","조정례");
		library[1] = new Book("태백산맥2","조정례");
		library[2] = new Book("태백산맥3","조정례");
		library[3] = new Book("태백산맥4","조정례");
		library[4] = new Book("태백산맥5","조정례");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		for(int i=0;i<library.length;++i) {//배열을 돌면서 직접 값을 넣어주어야 한다.
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("박원서");
		library[0].setTitle("나목");
		System.out.println("=======library======");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("=======copy library======");
		for(Book book : copyLibrary) {
			System.out.println(book);//주소가 다르기 때문에 값이 변경되지 않는다.
			book.showInfo();
		}
		//두배열이 같은 객체를 가리킬 필요가 있을경우 얇은 복사 , 아닐경우 깊은 복사
	}
}

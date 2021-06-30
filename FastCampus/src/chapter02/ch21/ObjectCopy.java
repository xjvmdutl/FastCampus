package chapter02.ch21;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];//복사할 배열
		library[0] = new Book("태백산맥1","조정례");
		library[1] = new Book("태백산맥2","조정례");
		library[2] = new Book("태백산맥3","조정례");
		library[3] = new Book("태백산맥4","조정례");
		library[4] = new Book("태백산맥5","조정례");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		//(어떤것을,0부터,어디에다가,0부터,5까지) 
		
//		System.out.println("=======library======");
//		for(Book book : library) {
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("=======copy library======");
//		for(Book book : copyLibrary) {
//			System.out.println(book);//복사된 내용이 주소도 같다.
//			book.showInfo();
//		}
		library[0].setAuthor("박원서");
		library[0].setTitle("나목");
		System.out.println("=======library======");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("=======copy library======");
		for(Book book : copyLibrary) {
			System.out.println(book);//카피한 것까지 같이 바뀌었다.
			book.showInfo();
		}
		
		//두개의 배열 모두 같은 주소의 참조변수를 가리키고 있기 떄문에 두배열 모두 영향을 미친다.
		
	}

}

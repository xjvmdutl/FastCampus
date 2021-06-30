package chapter02.ch21;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];//책이 5개 잡히는 것이 아니다.
		//기존 자료형처럼 크기가 정해지는 것이 아니라 참조변수 크기만큼 잡힌다.
//		for(int i=0;i<library.length;++i) {
//			System.out.println(library[i]);//객체는 null로 초기화
//			//4byte 잡힌다.
//			
//		}
		library[0] = new Book("태백산맥1","조정례");
		library[1] = new Book("태백산맥2","조정례");
		library[2] = new Book("태백산맥3","조정례");
		library[3] = new Book("태백산맥4","조정례");
		library[4] = new Book("태백산맥5","조정례");
		
		for(Book book : library) {
			System.out.println(book);//주소 출력
			book.showInfo();
		}
	}

}

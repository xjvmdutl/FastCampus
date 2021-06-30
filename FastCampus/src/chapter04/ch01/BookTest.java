package chapter04.ch01;
class Book{
	private String title;
	private String author;
	public Book(String title,String author) {
		this.author = author;
		this.title = title;
	}
	@Override
	public String toString() {//toString메소드 재정의
		return title + "," + author;
	}
}
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("데미안","헤르만 헤세");
		System.out.println(book);//클래스 주소와 클래스 이름을 출력한다.
		System.out.println(book.toString());//둘다 같다
		
		
		String str = new String("test");
		System.out.println(str.toString());
	}

}

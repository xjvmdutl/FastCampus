package chapter02.ch21;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];//å�� 5�� ������ ���� �ƴϴ�.
		//���� �ڷ���ó�� ũ�Ⱑ �������� ���� �ƴ϶� �������� ũ�⸸ŭ ������.
//		for(int i=0;i<library.length;++i) {
//			System.out.println(library[i]);//��ü�� null�� �ʱ�ȭ
//			//4byte ������.
//			
//		}
		library[0] = new Book("�¹���1","������");
		library[1] = new Book("�¹���2","������");
		library[2] = new Book("�¹���3","������");
		library[3] = new Book("�¹���4","������");
		library[4] = new Book("�¹���5","������");
		
		for(Book book : library) {
			System.out.println(book);//�ּ� ���
			book.showInfo();
		}
	}

}
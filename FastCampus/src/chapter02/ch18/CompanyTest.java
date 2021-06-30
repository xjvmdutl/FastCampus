package chapter02.ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();//인스턴스를 만들지 않고 바로쓰기 때문에 Static 메소드로 만든다.
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();//해당 시분초 객체는 유일해야 되기 떄문에 getInstance로 접근해야한다.
		
	}

}

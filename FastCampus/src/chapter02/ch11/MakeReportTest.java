package chapter02.ch11;

public class MakeReportTest {

	public static void main(String[] args) {
		MakeReport builder = new MakeReport();
		String report=builder.getReport();//getReport이 메소드를 제외한 나머지 메소드는 object의 메소드이다.
		System.out.println(report);

	}

}

package chapter02.ch11;

public class MakeReport {
	StringBuffer buffer = new StringBuffer();
	//String 클래스를 계속 더해서 쓰는 방법이 메모리 효율이 더 좋지 않기 떄문에 
	//내부적으로 버퍼를 가지고 있는 클래스에다가 String을 계속 연결하다가 마무리에 리턴하는 방식이 가장 효율적이다. 
	//StringBuffer, StringBuilder를 가장 많이 쓴다.
	
	private String line = "===========================================\n";
	private String title = "이름\t 주소 \t\t 전화번호 \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	private void makeFooter() {
		buffer.append(line);
	}
	public String getReport() {//모든 메소드가 private 되어 있고 이 메소드만 public 이다
		makeHeader();
		generateBody();
		makeFooter();		
		//외부에서 쓸수 있는 메소드는 getReport밖에 없다.
		//사실상 위에 3가지 메소드는 클라이언트에선 알 필요가 없기 때문에 클라이언트는 getReport만 쓰면 된다.
		//프로그래밍 할때는 어떤 메소드를 공개할지 안할지를 결정하고 코드를 짜야한다.
		return buffer.toString();
	}
}

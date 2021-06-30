package chapter01.ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "test";
		//컴파일러가 오른쪽 변수값으로 자료형을 추론 
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		var str2 = str;//String으로 추론했기 떄문에 대입하는것 또한 String으로 추론
		System.out.println(str2);
		
		str = "hello";
		//str = 3;//스크립트에서 가능하지만 자바에선 불가능(자료형이 이미 정해졋기 때문에)
		
	}

}

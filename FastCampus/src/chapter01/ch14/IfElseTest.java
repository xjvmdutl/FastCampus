package chapter01.ch14;

public class IfElseTest {

	public static void main(String[] args) {
		int age = 6;
		if(age >= 8) {//8살 이상일 경우만 출력 아닐경우는 else
			System.out.println("학교에 다닙니다.");
			//단락이 하나일 경우 중괄호를 하지 않아도 된다.
			//하지만 가독성이 떨어지기 때문에 중괄호를 쓰는것이 좋다
		}else {
			System.out.println("학교에 다니지 않습니다.");//if 에 해당되지 않는거를 잡아줄 수 있다
		}
		//들여쓰기를 반드시 해주어야 한다.(가독성)
		System.out.println("노는게 젤 좋아");
	}

}

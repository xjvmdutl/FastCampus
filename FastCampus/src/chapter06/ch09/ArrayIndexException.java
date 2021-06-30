package chapter06.ch09;

public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Index 초과 에러를 일으킬 예정
		int[] arr = {1,2,3,4,5};
		try {
			for(int i=0;i<=5;++i) {//length가 5인데 인덱스 5를 접근하였다
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {//해당 에러가 발생시 e라는 exception이 넘어온다.
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			//toString()은 exception full-name + message로 구성되어 있다
		}
		System.out.println("here!!");//여기까지 실행됬는지 테스트
		//비정상 종료가 되지 않았다. 서버가 죽지 않고 실행이 됬다(로그로 나중에 분석하여 해결)
	}

}

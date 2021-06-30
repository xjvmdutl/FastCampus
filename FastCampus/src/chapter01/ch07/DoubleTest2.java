package chapter01.ch07;

public class DoubleTest2 {

	public static void main(String[] args) {
		double dnum = 1;
		for(int i=0;i<10000;++i) {
			dnum = dnum+0.1;
		}
		System.out.println(dnum);//약간을 오차가 발생한다.
		//오류가 나는것을 알지만 부동소수점으로 표현하는것이 많은 범위를 표현할수 있기 떄문에 감안
		
	}

}


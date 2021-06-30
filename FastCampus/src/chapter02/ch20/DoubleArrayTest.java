package chapter02.ch20;

public class DoubleArrayTest {

	public static void main(String[] args) {
		double[] dArr = new double[5];
		int count = 0;//핸들링 변수
		dArr[0] = 1.1; 
		count++;
		dArr[1] = 2.1;
		count++;
		dArr[2] = 3.1;
		count++;//요소를 대입 할떄마다 더해준다
		double mtotal = 1; 
		for(int i = 0; i< count; i++) {
			mtotal *= dArr[i];
		} 
		System.out.println(mtotal);//해당 값이 0 으로 된다.
		//배열 크기를 전부 다 안쓰는 데 모든 요소 값을 다 곱하기 때문에 0이 나온다
		
		
	}

}

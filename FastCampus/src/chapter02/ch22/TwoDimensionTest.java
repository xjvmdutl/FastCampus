package chapter02.ch22;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr  = {{1,2,3},{1,2,3,4}};
		//int[][] arr  = new int[3][4];//0으로 초기화 하고 크기를 지정해야한다.
		int i,j;
		for(i=0;i<arr.length;++i) {//행
			for(j=0;j<arr[i].length;++j) {//열(i번째 행의 길이만큼 돌아라)
				System.out.print(arr[i][j]+ ",");
			}
			//행이 다 끝나면 줄바꿈
			System.out.println("\t"+arr[i].length);
		}
		//객체 이차원배열 또한 똑같다
	}

}

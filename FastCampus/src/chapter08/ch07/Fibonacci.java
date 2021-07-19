package chapter08.ch07;

public class Fibonacci {
	int[] value;//동적 프로그래밍 하기위한 변수
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		value = new int[number];
	}
	
	public int fibonacciRecur(int n) {
		//1번 방법 : 재귀함수 실행 -> 수행시간이 너무 길어진다.
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return fibonacciRecur(n-1) + fibonacciRecur(n-2);
	}
	
	public int fibonacciIter(int n) {
		int ppre = 0;//전전값
		int pre = 1;//전값
		int current = 0;
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		for(int i=2;i<=n;++i) {
			current = ppre + pre; // 현재 구하려는 값이다
			//이전 값과 이전이전값을 변경해 준다.
			ppre = pre;
			pre = current;
		}
		return current;
	}
	
	public int fibonacciMem(int n) {
		int result = 0;
		value[0] = 0;
		value[1] = 1;
		
		if(n == 0)
			return value[0];
		if(n == 1)
			return value[1];
		
		for(int i=2;i<=n;++i) {
			value[i] = value[i-1] + value[i-2];//배열에 있는값을 그냥 꺼내는 거기 때문에 훨씬 빠르다
			result = value[i];
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		//구현 방법 3가지
		Fibonacci fib = new Fibonacci(101);
		//int result = fib.fibonacciRecur(100);
		//int result = fib.fibonacciIter(100);//수행시간이 훨씬 빠르다
		int result = fib.fibonacciMem(100);//수행시간이 훨씬 빠르다
		System.out.println(result);
	}

}

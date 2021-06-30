package chapter06.ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for(int num : arr) {//�Ϲ��� ���
			System.out.println(num);
		}
		System.out.println();
		Arrays.stream(arr).forEach(n->System.out.println(n));//intStream�� ��ȯ���ش�.��Ҹ� �ϳ��� ������(���ٽ�)
		//forEach�� �ϳ��� ������ ���ٽ����� ����ض�.
		
		IntStream is=Arrays.stream(arr);//Ǯ�� ����
		//intStream�� �����ϴ� �������� ������ ���� �����Ѵ�.
		//�ڷ�ó���� ���� �߻����� ����� �ϰ������� �����Ѵ�.(long,int,double �� ����ϴ�.)
		is.forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();//���� �Ŀ��� �ٽ� ��Ʈ���� ���� �ؾߵȴ�.
		System.out.println(sum);
		long count = Arrays.stream(arr).count(); 
		System.out.println(count);
		//���������� ȣ��Ǵ� ���� �߰������� �����̵ȴ�.
		//��Ʈ���� �ٸ� �޸𸮸� ������ �ְ� ������ �Ѵٰų� �ص� ���� �����Ϳ� ������ ����.
		
	}

}

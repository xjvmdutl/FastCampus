package chapter08.ch04.dfs;

import java.util.Stack;

import chapter08.ch04.graph.UndirectedGraph;

public class DfsSearch {
	
	int count;
	boolean[] visited;//�湮 ���θ� ���� �ڷᱸ��
	Stack<Integer> stack;//���� �ڷᱸ�� �̿�
	int[][] matrix;
	
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];//�湮 ���� �ʱ�ȭ
		stack = new Stack<>();
	}
	
	public void dfsTraversal() {//Ž��
		stack.push(0);//0���� ������
		visited[0] = true;//ù��°���� �湮�߱� ������ true
		while(!stack.isEmpty()) {//stack�� ��������
			int node = stack.pop();//��带 ������
			System.out.print(node + " ");
			for(int j = 0; j<count ; ++j) {
				if(matrix[node][j] != 0 && !visited[j]) {//�湮���� �ʰ�, ������ �Ǿ� �ִٸ�
					stack.push(j);
					visited[j] = true;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		//�׷����� �׷��� �ȴ�.
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdges(0, 1, 1);//unDirect�̱� ������ �ϳ��� �־��ָ� �ȴ�.
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		DfsSearch dfs = new DfsSearch(count);
		dfs.matrix = graph.getMatrix();
		dfs.dfsTraversal();
	}

}

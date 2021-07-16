package chapter08.ch04.dfs;

import java.util.Stack;

import chapter08.ch04.graph.UndirectedGraph;

public class DfsSearch {
	
	int count;
	boolean[] visited;//방문 여부를 넣을 자료구조
	Stack<Integer> stack;//스택 자료구조 이용
	int[][] matrix;
	
	public DfsSearch(int count) {
		this.count = count;
		visited = new boolean[count];//방문 여부 초기화
		stack = new Stack<>();
	}
	
	public void dfsTraversal() {//탐색
		stack.push(0);//0부터 돌꺼라서
		visited[0] = true;//첫번째꺼는 방문했기 때문에 true
		while(!stack.isEmpty()) {//stack이 빌때까지
			int node = stack.pop();//노드를 꺼낸뒤
			System.out.print(node + " ");
			for(int j = 0; j<count ; ++j) {
				if(matrix[node][j] != 0 && !visited[j]) {//방문하지 않고, 연결이 되어 있다면
					stack.push(j);
					visited[j] = true;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		//그래프를 그려야 된다.
		int count = 8;
		UndirectedGraph graph = new UndirectedGraph(count);
		graph.addEdges(0, 1, 1);//unDirect이기 때문에 하나만 넣어주면 된다.
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

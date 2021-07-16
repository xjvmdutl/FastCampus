package chapter08.ch04.graph;

public class UndirectedGraph {
	
	private int count;//노드 갯수
	private int[][] vertexMatrix;//그래프
	
	public UndirectedGraph(int count) {//생성자로 몇개인지 받는다
		this.count = count;
		vertexMatrix = new int[count][count];
		//간선정보가 없어서 메소드 제공
	}
	public void addEdges(int from,int to,int weight) {
		//현재는 가중치가 똑같기 때문에 같은값을 주면 된다.
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
		//undirected 그래프 이기 떄문에 from->to , to->from이 같다
	}
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}

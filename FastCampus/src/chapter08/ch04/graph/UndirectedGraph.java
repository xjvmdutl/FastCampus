package chapter08.ch04.graph;

public class UndirectedGraph {
	
	private int count;//��� ����
	private int[][] vertexMatrix;//�׷���
	
	public UndirectedGraph(int count) {//�����ڷ� ����� �޴´�
		this.count = count;
		vertexMatrix = new int[count][count];
		//���������� ��� �޼ҵ� ����
	}
	public void addEdges(int from,int to,int weight) {
		//����� ����ġ�� �Ȱ��� ������ �������� �ָ� �ȴ�.
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
		//undirected �׷��� �̱� ������ from->to , to->from�� ����
	}
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}

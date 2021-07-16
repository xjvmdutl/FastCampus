package chapter08.ch05;

public class MyGraph {
	
	private int count;
	private int[][] vertexMatrix;
	private int[] distance; // ���� �ִ� ���� ����� ���
	private boolean[] visited; //�̹� ���� �Ǿ�����
	private static int UNLIMIT = 999999999;

	public MyGraph(int count) {
		this.count = count;
		vertexMatrix = new int[count][count];
		distance = new int[count];
		visited = new boolean[count];
	}
	
	public void addEdges(int from,int to,int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public void calcShotestPath(int from) {
		//�ʱ⿡�� 999999999������ ����
		for(int i=0;i<count;++i) {
			distance[i] = UNLIMIT;
		}
		
		//from ��ġ���� ����
		visited[from] = true;
		distance[from] = 0;//������ �������� ���°Ŵϱ� 0

		//������ distance����
		for(int i=0;i<count;++i) {
			if(visited[from] && vertexMatrix[from][i] != 0) {
				//�湮���� �ʰ� ������ ��带 �����Ͽ� �ش� 
				distance[i] = vertexMatrix[from][i];
			}
		}
		

		
		for(int k=0;k<count-1;++k) {//�ʱ� from�� �ֱ⋚���� �ϳ�����
			
			int min = UNLIMIT;
			int minIndex = -1;
			
			for(int i = 0; i< count ;i++){
                if(!visited[i] && distance[i]!=UNLIMIT){
                	//�߰� ���İ��� ���� ���õ��� �ʰ� ���� ����� ��带 �����Ѵ�
                    if(distance[i] < min ){
                        min = distance[i];
                        minIndex = i;
                    }
                }
            }
            
            visited[minIndex] = true;
            for(int i=0; i<count; i++){
                if(!visited[i] && vertexMatrix[minIndex][i]!=0){
                    if(distance[i]>distance[minIndex]+vertexMatrix[minIndex][i]){
                    	//������� + ���İ��� ��� < distance[i]�� Ŭ��� �ּҰ����� ������ �ش�.
                        distance[i] = distance[minIndex]+vertexMatrix[minIndex][i];
                    }
                }
            }

			
		}
	}
	
	public void showDistance(int from) {
    	for(int i = 0; i<count; i++) {
    		System.out.println(from + " ���κ��� " + i + " ����� �ִ� �Ÿ��� : " + distance[i]);
    	}
	}

	
	public static void main(String[] args) {
		MyGraph graph = new MyGraph(6);
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 4);
		graph.addEdges(1, 2, 2);
		graph.addEdges(2, 3, 1);
		graph.addEdges(3, 4, 8);
		graph.addEdges(3, 5, 3);
		graph.addEdges(4, 5, 4);

		graph.calcShotestPath(0);
		graph.showDistance(0);

	}

}

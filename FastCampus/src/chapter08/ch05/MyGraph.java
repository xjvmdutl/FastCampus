package chapter08.ch05;

public class MyGraph {
	
	private int count;
	private int[][] vertexMatrix;
	private int[] distance; // 남아 있는 가장 가까운 노드
	private boolean[] visited; //이미 선택 되었는지
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
		//초기에는 999999999값으로 세팅
		for(int i=0;i<count;++i) {
			distance[i] = UNLIMIT;
		}
		
		//from 위치부터 시작
		visited[from] = true;
		distance[from] = 0;//본인이 본인한테 가는거니까 0

		//연결노드 distance갱신
		for(int i=0;i<count;++i) {
			if(visited[from] && vertexMatrix[from][i] != 0) {
				//방문하지 않고 인접한 노드를 갱신하여 준다 
				distance[i] = vertexMatrix[from][i];
			}
		}
		

		
		for(int k=0;k<count-1;++k) {//초기 from이 있기떄문에 하나적게
			
			int min = UNLIMIT;
			int minIndex = -1;
			
			for(int i = 0; i< count ;i++){
                if(!visited[i] && distance[i]!=UNLIMIT){
                	//중간 거쳐가는 노드로 선택되지 않고 가장 가까운 노드를 선택한다
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
                    	//인접노드 + 거쳐가는 노드 < distance[i]가 클경우 최소값으로 변경해 준다.
                        distance[i] = distance[minIndex]+vertexMatrix[minIndex][i];
                    }
                }
            }

			
		}
	}
	
	public void showDistance(int from) {
    	for(int i = 0; i<count; i++) {
    		System.out.println(from + " 노드로부터 " + i + " 노드의 최단 거리는 : " + distance[i]);
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

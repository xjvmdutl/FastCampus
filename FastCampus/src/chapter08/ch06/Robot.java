package chapter08.ch06;

import java.util.Stack;

public class Robot {
	public static int NUMDIRECTIONS = 4;//상하좌우
	public static int WIDTH = 8;//미로 길이
	public static int HEIGHT = 8;//미로 넓이
	
	Stack<Move> stack = new Stack<>();//좌표를 담을 자료구조 
	Move move;//현재 좌표
	Maze maze = new Maze();// 미로
	
	public int[][] DIRECTION_OFFSETS = {
			{0,-1}//위쪽으로 이동
			,{1,0}//오른쪽으로 이동
			,{0,1}//아래쪽으로 이동
			,{-1,0}//왼쪽으로 이동
	};
	public static int NOTVISIT = 0;//방문 안함
	public static int WALL = 1;//벽
	public static int VISIT = 2;//방문 완료
	int[][] markArray = new int[8][8];
	
	public void findPath(int startX,int startY,int endX,int endY) {
		boolean isEmpty = false; 
		boolean isFound = false;
		int i = 0;
		
		Move start = new Move(startX,startY);
		start.direction = 0;
		stack.push(start);
		while(!isEmpty && !isFound) {//스택이 비어있거나, 찾을떄까지
			Move curPos = stack.pop();
			int x = curPos.x;
			int y = curPos.y;
			int direction = curPos.direction;//어느방향 갔는지.. 초기에는 0
			while(!isFound && direction < NUMDIRECTIONS) {
				//목표 지점을 못 찾았고, 미로 밖이 아닐때까지 
				int newX = x + DIRECTION_OFFSETS[direction][0];
				int newY = y + DIRECTION_OFFSETS[direction][1];

				if (newX >= 0 && newX < WIDTH
							&& newY >= 0 && newY < HEIGHT
							&& maze.myMaze[newY][newX] == NOTVISIT
							&& markArray[newY][newX] == NOTVISIT) {										
					Move newPosition = new Move(newX, newY);
					newPosition.direction = direction + 1;
					stack.push(newPosition);
					markArray[y][x] = VISIT;

					x = newX;
					y = newY;
					direction = 0;

					if (newX == endX && newY == endY) {
						isFound = true;
						newPosition.x = newX;
						newPosition.y = newY;
						newPosition.direction = 0;
						stack.push(newPosition);
						markArray[newY][newX] = VISIT;
					}
				}else {
					direction++;
				}
			}
			isEmpty = stack.isEmpty();
		}
	}
	public void showPath() {
		int[][] resultArray = new int[8][8];
		boolean isEmpty = false;
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				resultArray[i][j] = maze.myMaze[i][j];
			}
		}
		for(int i = 0; i < HEIGHT; i++) {
			for(int j = 0; j < WIDTH; j++) {
				if (maze.myMaze[i][j] == WALL) {
					System.out.print("*");
				}
				else if (markArray[i][j] == VISIT) {
					System.out.print("|");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		int i = 0;
		while(isEmpty == false) {
			Move move = stack.pop();
			int x = move.x;
			int y = move.y;
			resultArray[y][x] = VISIT;

			if (i > 0) {
				System.out.print("<-");
			}
			System.out.print("(" + x +"," + y + ") ");
			i++;
			isEmpty = stack.isEmpty();
		}
		System.out.println();


	}
}

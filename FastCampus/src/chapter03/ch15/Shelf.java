package chapter03.ch15;

import java.util.ArrayList;

public class Shelf {
	//순서대로 자료를 넣기위해 Arraylist
	protected ArrayList<String> shelf;
	public Shelf() {
		shelf = new ArrayList<>();//맴버변수 초기화
	}
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
}

package chapter05.ch08;

public class GenericMethod {
	public static <T,V> double makeRectangle (Point<T,V> p1,Point<T,V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	public static void main(String[] args) {
		Point<Integer,Double> p1 = new Point<Integer, Double>(0,0.0);
		Point<Integer,Double> p2 = new Point<>(10,10.0);//생략 가능
		
		
		double size = GenericMethod.<Integer,Double>makeRectangle(p1, p2);
		//제네릭 클래스가 아니여도 제네릭 메소드 호출가능
		System.out.println(size);
	}

}

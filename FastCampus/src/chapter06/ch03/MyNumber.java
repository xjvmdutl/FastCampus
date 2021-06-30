package chapter06.ch03;
@FunctionalInterface
//모호성의 없애기 위해 어노테이션을 쓴다.
//인터페이스에서 바로 에러가 생긴다.
public interface MyNumber {
	int getMax(int num1,int num2);
	//int sub(int x,int y);//어떤 인터페이스의 함수를 구현했는지 에매해지기때문에 메소드는 하나만 있어야된다.
}

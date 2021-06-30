package chapter02.ch15;

public class TakeTransTest {

	public static void main(String[] args) {
		Student studentE = new Student("Edward", 20000);
		Tex unsuTex = new Tex("잘나간다 운수");
		studentE.takeTex(unsuTex, 10000);
		studentE.showInfo();
		unsuTex.showTexInfo();
		
	}

}

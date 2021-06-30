package chapter05.ch13;

import java.util.Comparator;
import java.util.TreeSet;
class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2))*(-1);
	}
	
}
public class MemberTreeSetTest {

	public static void main(String[] args) {
		/*
			TreeSet<String> set = new TreeSet<String>();//예시
			//순서는 상관없고 출력시 정령되는지 확인 필요
			set.add("홍길동");
			set.add("강감찬");
			set.add("이순신");
			System.out.println(set);//정렬되어 출력된다.
		*/
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		Member memberHong = new Member(1004,"홍길동");		
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		
		//오류가 난다 ( why? TreeSet으로 구현했지만 비교를 할수 없기 때문에 에러가난다(comparable구현이 안되있다))
		//add시 compareTo가 호출이 되지만 몇번호출될지 모른다.
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
		
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());//비교방식을 새로 만든다.
		//기본적으로 String compareTo 메소드가 구현되어 있어서 오름차순 구현 되어 있다.
		
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		System.out.println(set);
		
	}

}

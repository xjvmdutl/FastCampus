package chapter05.ch14;

import java.util.HashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//member 생성
		Member memberHong = new Member(1004,"홍길동");
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberKang);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1001,"Kim");
		hashMap.put(1002,"Lee");
		hashMap.put(1003,"Park");
		hashMap.put(1004,"Hong");
		System.out.println(hashMap);//hashMap을 toString
	}

}


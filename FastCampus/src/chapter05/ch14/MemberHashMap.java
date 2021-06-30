package chapter05.ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		//hash테이블은 컬리젼이 발생할수 있다.(자주 발생하게 되면 hashTable을 만들 비용이 부족해진다)= 오버헤드
		//hashTable을 꽉채워서 쓰지 않는다 java에는서 75%
		hashMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {//오토박싱 언박싱을 컴파일러가 해준다
		if(hashMap.containsKey(memberId)) {//HashMap에 존재하냐
			hashMap.remove(memberId);
		}
		System.out.println("no element");
		return false;
	}
	public void showAllMember() {
		//hashMap은 키나 value에서 어떤거로 가지고 올지 선택해야된다.
		Iterator<Integer> ir = hashMap.keySet().iterator();//key 컬렉션중 iterater를 사용가능
		
		//hashMap.values().iterator();//value 값들의 collection으로 뽑아옴
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}

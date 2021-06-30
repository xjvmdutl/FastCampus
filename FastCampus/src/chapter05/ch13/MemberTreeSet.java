package chapter05.ch13;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		//에러가 난다 = > Comparator 인터페이스를 쓰기위해서는 어떤거로 구현을 했는지 꼭 써줘야 한다.
		//() 안에 요소르 Comparator를 구현한다고 지정해줘야한다.
		//Comparator는 Compareble로 구현되어 있는 요소를 Comparator로 구현할때 사용한다.
		treeSet = new TreeSet<>(new Member());
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tmpId = member.getMemberId();
			if(tmpId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}

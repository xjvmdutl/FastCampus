package chapter05.ch13;


import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		//������ ���� = > Comparator �������̽��� �������ؼ��� ��ŷ� ������ �ߴ��� �� ����� �Ѵ�.
		//() �ȿ� ��Ҹ� Comparator�� �����Ѵٰ� ����������Ѵ�.
		//Comparator�� Compareble�� �����Ǿ� �ִ� ��Ҹ� Comparator�� �����Ҷ� ����Ѵ�.
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
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}

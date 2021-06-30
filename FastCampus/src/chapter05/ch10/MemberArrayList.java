package chapter05.ch10;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;//아무것도 입력하지 않을경우 object형식을 입력받는다
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);//크기를입력받는다
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {
		for(int i = 0;i<arrayList.size();++i) {
			Member member = arrayList.get(i);
			int tmpId = member.getMemberId();
			if(tmpId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		//제어문을 통과하면 값이 없다는 뜻
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}

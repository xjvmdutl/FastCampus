package chapter05.ch10;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;//�ƹ��͵� �Է����� ������� object������ �Է¹޴´�
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);//ũ�⸦�Է¹޴´�
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
		//����� ����ϸ� ���� ���ٴ� ��
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}

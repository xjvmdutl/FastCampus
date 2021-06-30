package chapter05.ch13;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
public class Member implements Comparator<Member>{
	private int memberId; //ȸ�� ���̵�
	private String memberName;//ȸ�� �̸�
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public Member() {
		
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " ȸ������ ���̵�� "+ memberId + "�Դϴ�";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return memberId;
	}

	/*
	@Override
	public int compareTo(Member member) {//�� �޼ҵ带 ���� ���̵� �ؾ��� �񱳰� �ȴ�
		
		//member = Ʈ���� �����ϰ� �ִ� �ϳ��� ��ҵ�
		//�ݹ��Լ� : ���� ȣ���ϴ°� �ƴ϶� �ý����� ȣ���� �ش�
		if(this.memberId > member.memberId) {
			return 1;
			//return -1;//���� �ݴ�� �ϸ� �������� �����̵ȴ�
		}else if(this.memberId < memberId) {
			return -1;
			//return 1;
		}else {
			return 0;
			 
		}
		//�ش� ��������ϸ� ������������ ���ĵȴ�.
		
		return (this.memberId - member.memberId);//�̷��� �����ص��ȴ�
		//return (this.memberId - member.memberId) * (-1);//��������
		
	}
	 */
	@Override
	public int compare(Member member1, Member member2) {//�ŰԺ����� 2���̴�,�ϳ��� �� �ϳ��� �񱳴��
		return (member1.memberId - member2.memberId);

	}
	
}

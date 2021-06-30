package chapter05.ch13;

import java.util.Comparator;

//public class Member implements Comparable<Member>{
public class Member implements Comparator<Member>{
	private int memberId; //회원 아이디
	private String memberName;//회원 이름
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
		return memberName + " 회원님의 아이디는 "+ memberId + "입니다";
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
	public int compareTo(Member member) {//이 메소드를 오버 라이딩 해야지 비교가 된다
		
		//member = 트리를 구성하고 있는 하나의 요소들
		//콜백함수 : 내가 호출하는게 아니라 시스템이 호출해 준다
		if(this.memberId > member.memberId) {
			return 1;
			//return -1;//값을 반대로 하면 내림차순 정렬이된다
		}else if(this.memberId < memberId) {
			return -1;
			//return 1;
		}else {
			return 0;
			 
		}
		//해당 방식으로하면 오름차순으로 정렬된다.
		
		return (this.memberId - member.memberId);//이렇게 구현해도된다
		//return (this.memberId - member.memberId) * (-1);//내림차순
		
	}
	 */
	@Override
	public int compare(Member member1, Member member2) {//매게변수가 2개이다,하나는 나 하나는 비교대상
		return (member1.memberId - member2.memberId);

	}
	
}

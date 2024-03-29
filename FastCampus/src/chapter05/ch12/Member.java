package chapter05.ch12;

public class Member {
	private int memberId; //회원 아이디
	private String memberName;//회원 이름
	public Member(int memberId,String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
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
		return memberId;//같은객체일때 동일한 hashCode를 같게한다.
		//jdk 안에 이미 hashCode를 많이 구현이 되어있다.
	}
}

package chapter05.ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//member 생성
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberKang = new Member(1003,"강감찬");
		
		

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		//memberId가 중복되어 있는데 들어간다.
		//memberId가 같은거라는 정의를 안했기 때문에 중복되어 들어간다
		//memberId가 같은지 equals,hashCode를 재정의 해줘야한다.
		//동일한 값인지는 개발자가 직접 구현 해 주어야 된다.
		Member memberHong = new Member(1003,"홍길동");
		memberHashSet.addMember(memberHong);
		
		//들어간 순서대로 나오지 않는다		
		memberHashSet.showAllMember();
		
	}

}

package chapter05.ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//member ����
		Member memberLee = new Member(1001,"�̼���");
		Member memberKim = new Member(1002,"������");
		Member memberKang = new Member(1003,"������");
		
		

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		
		//memberId�� �ߺ��Ǿ� �ִµ� ����.
		//memberId�� �����Ŷ�� ���Ǹ� ���߱� ������ �ߺ��Ǿ� ����
		//memberId�� ������ equals,hashCode�� ������ ������Ѵ�.
		//������ �������� �����ڰ� ���� ���� �� �־�� �ȴ�.
		Member memberHong = new Member(1003,"ȫ�浿");
		memberHashSet.addMember(memberHong);
		
		//�� ������� ������ �ʴ´�		
		memberHashSet.showAllMember();
		
	}

}

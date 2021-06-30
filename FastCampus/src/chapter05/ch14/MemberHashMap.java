package chapter05.ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		//hash���̺��� �ø����� �߻��Ҽ� �ִ�.(���� �߻��ϰ� �Ǹ� hashTable�� ���� ����� ����������)= �������
		//hashTable�� ��ä���� ���� �ʴ´� java���¼� 75%
		hashMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {//����ڽ� ��ڽ��� �����Ϸ��� ���ش�
		if(hashMap.containsKey(memberId)) {//HashMap�� �����ϳ�
			hashMap.remove(memberId);
		}
		System.out.println("no element");
		return false;
	}
	public void showAllMember() {
		//hashMap�� Ű�� value���� ��ŷ� ������ ���� �����ؾߵȴ�.
		Iterator<Integer> ir = hashMap.keySet().iterator();//key �÷����� iterater�� ��밡��
		
		//hashMap.values().iterator();//value ������ collection���� �̾ƿ�
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
}

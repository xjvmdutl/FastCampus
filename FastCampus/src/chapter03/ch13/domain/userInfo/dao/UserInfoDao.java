package chapter03.ch13.domain.userInfo.dao;

import chapter03.ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {
	//DB������ �°� ���� �����ڵ忡�� ������ �ָ� �ȴ�.
	//Ŭ���̾�Ʈ������ �ش� �������̽��� ���� ����ϸ� �ȴ�.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}

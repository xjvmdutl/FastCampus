package chapter03.ch13.domain.userInfo.dao;

import chapter03.ch13.domain.userInfo.UserInfo;

public interface UserInfoDao {
	//DB버젼에 맞게 실제 구현코드에서 구현해 주면 된다.
	//클라이언트에서는 해당 인터페이스만 보고 사용하면 된다.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}

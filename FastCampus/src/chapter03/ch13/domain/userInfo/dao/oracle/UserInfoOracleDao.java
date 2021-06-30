package chapter03.ch13.domain.userInfo.dao.oracle;

import chapter03.ch13.domain.userInfo.UserInfo;
import chapter03.ch13.domain.userInfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB userID = "+userInfo.getUserId());
		//원래는 statement에 채워 쿼리를 친다. 
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update from Oracle DB userID = "+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from Oracle DB userID = "+userInfo.getUserId());
	}
}

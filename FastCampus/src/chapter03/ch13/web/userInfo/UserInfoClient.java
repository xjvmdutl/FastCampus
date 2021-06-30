package chapter03.ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import chapter03.ch13.domain.userInfo.UserInfo;
import chapter03.ch13.domain.userInfo.dao.UserInfoDao;
import chapter03.ch13.domain.userInfo.dao.mysql.UserInfoMySqlDao;
import chapter03.ch13.domain.userInfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException{
		//파일에서 DB타입을 읽어들여서 설정하려고 한다.
		//현재는 임시로 그냥 하는 것이다.
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();//~~ = ~~ 객체를 쌍으로 읽어들이는 클래스
		prop.load(fis);//두개의 쌍으로 되어있는 값을 읽어서 리턴해준다.
		
		String dbtype = prop.getProperty("DBTYPE");//DBTYPE=~~ 에서 값을 읽어온다.
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPasswword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;//초기에는 없기 때문에 null
		if(dbtype.equals("ORACLE")) {//프로퍼티에서 값을 읽어서 분기처리한다.
			userInfoDao = new UserInfoOracleDao();
		}else if(dbtype.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}else {
			System.out.println("db error");
			return;
		}
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}

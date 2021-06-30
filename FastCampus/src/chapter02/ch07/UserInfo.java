package chapter02.ch07;

public class UserInfo {
	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {
		
	}
	public UserInfo(String userId,String userPassWord,String userName) {//생성자를 따로 만들지 않을경우 컴파일러가 자동으로 생성한다.
		this.userId=userId;
		this.userPassWord=userPassWord;
		this.userName=userName;
				
	}
	public String showUserInfo() {
		return "고객님의 아이디는 "+userId+"이고, 등록된 이름은 "+userName+"입니다";
	}
}

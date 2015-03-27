
package net.nic307.user.domain;
/**
 * @author Rain
 * 
 */
public class User {
	private int userId;
	private String userName;    
	private String userPassword;   //用户密码
	private String userGrade;   //用户年级
	private String userCollage;  //用户院系
	private String userMajor;   //用户专业
	private String userNumber;   //用户联系电话
	private String userQQ;     //用户QQ
	private String userEmail;   //用户邮箱
	private String userSex;   //性别
	
	public User(){}   //空的构造函数

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

	public String getUserMajor() {
		return userMajor;
	}

	public void setUserMajor(String userMajor) {
		this.userMajor = userMajor;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserQQ() {
		return userQQ;
	}

	public void setUserQQ(String userQQ) {
		this.userQQ = userQQ;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	
	

	public String getUserCollage() {
		return userCollage;
	}

	public void setUserCollage(String userCollage) {
		this.userCollage = userCollage;
	}
	
	
	
	
	
	
}

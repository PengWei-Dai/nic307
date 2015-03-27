/**
 * 
 */
package net.nic307.user.action;

import net.nic307.user.domain.User;
import net.nic307.user.server.UserServer;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Rain
 * 这是一个将浏览器请求的分发到各个不同的方法中去。
 */
public class UserAction extends ActionSupport{
	private String userName;
	private String userPassword;
	private String userNumber;
	private String userCollage;
	private String userMajor;
	private String userEmail;
	private UserServer userServer;
	

		public String register() throws Exception {
	        if(userName != null && userPassword !=null){
	        	User user = new User();
	        	user.setUserName(userName);
	        	user.setUserCollage(userCollage);
	        	user.setUserEmail(userEmail);
	        	user.setUserCollage(userCollage);
	        	user.setUserMajor(userMajor);
	        	user.setUserPassword(userPassword);
	        	user.setUserNumber(userNumber);
	        	userServer.registUser(user);
	        }
	        return SUCCESS;
	    }
	
	
		
		
		
	
	public UserServer getUserServer() {
			return userServer;
		}
		public void setUserServer(UserServer userServer) {
			this.userServer = userServer;
		}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @param userNumber the userNumber to set
	 */
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	/**
	 * @param userCollege the userCollege to set
	 */
	public void setUserCollage(String userCollage) {
		this.userCollage = userCollage;
	}
	/**
	 * @param userMajor the userMajor to set
	 */
	public void setUserMajor(String userMajor) {
		this.userMajor = userMajor;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	
}

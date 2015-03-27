/**
 * 
 */
package net.nic307.user.server;

import java.util.List;

import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.User;




/**
 * @author Rain
 * UserServer�ṩһ��������Dao�����ݽ��д���֮�󣬷���action�����Ȥ�����ݡ�
 */
public class UserServer {
	
	private UserDao userDao;
	
	//Userע��
	public void registUser(User user){
		userDao.save(user);
	}
	//�û���¼
	public boolean loginUser(String userName, String userPassword) {
		List<User> users = userDao.findByName(userName);
		String password="";
		if(users.size()>0){
			password = users.get(0).getUserPassword();
		}else return false;
		if(password.equals(userPassword)){
			return true;
		}
		else return false;
	}
	

	
	

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}







}

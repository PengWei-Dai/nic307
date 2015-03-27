/**
 * 
 */
package net.nic307.user.server;

import java.util.List;

import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.User;




/**
 * @author Rain
 * UserServer提供一个对数据Dao层数据进行处理之后，返回action层感兴趣的数据。
 */
public class UserServer {
	
	private UserDao userDao;
	
	//User注册
	public void registUser(User user){
		userDao.save(user);
	}
	//用户登录
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

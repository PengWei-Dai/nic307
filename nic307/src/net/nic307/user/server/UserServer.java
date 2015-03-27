/**
 * 
 */
package net.nic307.user.server;

import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.User;




/**
 * @author Rain
 * UserServer提供一个对数据Dao层数据进行处理之后，返回action层感兴趣的数据。
 */
public class UserServer {
	
	private UserDao userDao;
	
	public void registUser(User user){
		userDao.save(user);
	}

	
	
	
	

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}

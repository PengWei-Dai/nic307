/**
 * 
 */
package net.nic307.user.server;

import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.User;




/**
 * @author Rain
 * UserServer�ṩһ��������Dao�����ݽ��д���֮�󣬷���action�����Ȥ�����ݡ�
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

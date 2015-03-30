/**
 * 
 */
package net.nic307.user.server;

import java.util.List;

import net.nic307.user.dao.UmiDao;
import net.nic307.user.dao.UserDao;
import net.nic307.user.domain.Umi;
import net.nic307.user.domain.User;




/**
 * @author Rain
 * UserServer提供一个对数据Dao层数据进行处理之后，返回action层感兴趣的数据。
 */
public class UserServer {
	
	private UserDao userDao;
	private UmiDao umiDao;
	private Umi umi;
	
	//User注册  同时创建umi对象
	public void registUser(User user){
		user.setUmi(umi);   //通过Spring的注入将引用交给user对象
		umi.setUser(user);  
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
	
    //根据用户名查找用户
	public User getByName(String userName){
		List<User> users = userDao.findByName(userName);
		return users.get(0);
	}
	
	public void updata(User user){
		
		userDao.save(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public UmiDao getUmiDao() {
		return umiDao;
	}
	public void setUmiDao(UmiDao umiDao) {
		this.umiDao = umiDao;
	}
	public Umi getUmi() {
		return umi;
	}
	public void setUmi(Umi umi) {
		this.umi = umi;
	}

}

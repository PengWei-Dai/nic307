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
 * UserServer�ṩһ��������Dao�����ݽ��д���֮�󣬷���action�����Ȥ�����ݡ�
 */
public class UserServer {
	
	private UserDao userDao;
	private UmiDao umiDao;
	private Umi umi;
	
	//Userע��  ͬʱ����umi����
	public void registUser(User user){
		user.setUmi(umi);   //ͨ��Spring��ע�뽫���ý���user����
		umi.setUser(user);  
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
	
    //�����û��������û�
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

/**
 * 
 */
package net.nic307.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import net.nic307.user.domain.User;

/**
 * @author Rain
 * 用户类的持久层操作
 */
public class UserDao {
	
	// property constants
		public static final String ID="userId";
		public static final String NAME = "userName";
		public static final String PASSWORD = "userPassword";

	//Spring IOC注入
	private User user;
	private HibernateTemplate hibernateTemplate;
	

	//存储一个user
	public void save(User user){
		this.hibernateTemplate.save(user);
	}
	
	
	
	//通过Id查询user
	public List<User> findById(int userId){
		return findByProperty(ID, userId);
	}
	//通过Name查询user
	public List<User> findByName(String userName){
		return findByProperty(NAME, userName);
	}
	
	//查询user属性的中任何一个属性
	public List<User> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {		
			throw re;
		}
	}
	
	
	
	
	
	
	//for user and hibernateTemplate 提供setter注入
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return user;
	}
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
}

/**
 * 
 */
package net.nic307.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import net.nic307.user.domain.User;

/**
 * @author Rain
 * �û���ĳ־ò����
 */
public class UserDao {
	
	// property constants
		public static final String ID="userId";
		public static final String NAME = "userName";
		public static final String PASSWORD = "userPassword";

	//Spring IOCע��
	private User user;
	private HibernateTemplate hibernateTemplate;
	

	//�洢һ��user
	public void save(User user){
		this.hibernateTemplate.save(user);
	}
	
	
	
	//ͨ��Id��ѯuser
	public List<User> findById(int userId){
		return findByProperty(ID, userId);
	}
	//ͨ��Name��ѯuser
	public List<User> findByName(String userName){
		return findByProperty(NAME, userName);
	}
	
	//��ѯuser���Ե����κ�һ������
	public List<User> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from User as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {		
			throw re;
		}
	}
	
	
	
	
	
	
	//for user and hibernateTemplate �ṩsetterע��
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

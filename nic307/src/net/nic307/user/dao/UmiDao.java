/**
 * 
 */
package net.nic307.user.dao;

import java.util.List;

import net.nic307.user.domain.Umi;
import net.nic307.user.domain.User;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author Rain
 * 用户信息的扩展类 Umi UserMoreInfo 的dao层操作
 */
public class UmiDao {
	
	//Spring Ioc注入
	private Umi umi;
	private HibernateTemplate hibernateTemplate;
	
	public void save(Umi umi){
		this.getHibernateTemplate().save(umi);
	}
	
	
	
	
	
	
	
	
	//查询user属性的中任何一个属性
	public List<User> findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from Umi as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {		
			throw re;
		}
	}
	
	public Umi getUmi() {
		return umi;
	}
	public void setUmi(Umi umi) {
		this.umi = umi;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}	

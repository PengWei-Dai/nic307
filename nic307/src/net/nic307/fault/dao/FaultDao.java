/**
 * 
 */
package net.nic307.fault.dao;

import java.util.List;

import net.nic307.fault.domain.Fault;

import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 * @author Rain
 *
 */
public class FaultDao {
	
	//需要注入的属性
	private HibernateTemplate hibernateTemplate;
	private Fault fault;

	public void save(Fault fault){
		this.getHibernateTemplate().save(fault);
	}
	
	//根据标记来查询数据
	public List<Fault> findFaultByState(String pend){
		if("PENDING".equals(pend)){
		List<Fault> faults = this.findByProperty("isFault", Fault.PENDING);
			return faults;
		}else if("PENDED".equals(pend)){
			List<Fault> faults = this.findByProperty("isFault", Fault.PENDED);
			System.out.println("故障数："+faults.size());
			return faults;
		}
		else return null;
	}
	
	//查询所有数据
	public List<Fault> findAllFault(){
		@SuppressWarnings("unchecked")
		List<Fault> faults = this.getHibernateTemplate().find("from Fault");
		return faults;
	}

	//查询属性的父类
	public List<Fault> findByProperty(String propertyName ,Object value){
		try {
			String queryString = "from Fault as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {		
			throw re;
		}
	}
	
	//setter注入
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public Fault getFault() {
		return fault;
	}
	public void setFault(Fault fault) {
		this.fault = fault;
	}
	
}

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
	
	//��Ҫע�������
	private HibernateTemplate hibernateTemplate;
	private Fault fault;

	public void save(Fault fault){
		this.getHibernateTemplate().save(fault);
	}
	
	//���ݱ������ѯ����
	public List<Fault> findFaultByState(String pend){
		if("PENDING".equals(pend)){
		List<Fault> faults = this.findByProperty("isFault", Fault.PENDING);
			return faults;
		}else if("PENDED".equals(pend)){
			List<Fault> faults = this.findByProperty("isFault", Fault.PENDED);
			System.out.println("��������"+faults.size());
			return faults;
		}
		else return null;
	}
	
	//��ѯ��������
	public List<Fault> findAllFault(){
		@SuppressWarnings("unchecked")
		List<Fault> faults = this.getHibernateTemplate().find("from Fault");
		return faults;
	}

	//��ѯ���Եĸ���
	public List<Fault> findByProperty(String propertyName ,Object value){
		try {
			String queryString = "from Fault as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {		
			throw re;
		}
	}
	
	//setterע��
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

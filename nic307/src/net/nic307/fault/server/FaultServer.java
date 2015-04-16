/**
 * 
 */
package net.nic307.fault.server;

import java.util.ArrayList;
import java.util.List;

import net.nic307.fault.dao.FaultDao;
import net.nic307.fault.domain.Fault;

/**
 * @author Rain
 * ��fault��ҵ�����з�װ
 */
public class FaultServer {
	
	//springע������
	private FaultDao faultDao;
	
	//��������
	public void ApplyFault(Fault fault){
		faultDao.save(fault);
	}
	
	//��ѯ���������
	public List<Fault> FindPending(){
		List<Fault> temp = faultDao.findFaultByState("PENDING");
		//������˳�򽻻�����󱨵Ĺ��Ϸ�����ǰ��
		List<Fault> faults = new ArrayList<Fault>();
		for(int i=temp.size()-1 ; i>=0 ; i--){
			faults.add(temp.get(i));
			temp.remove(i);
		}
		return faults;
	}
	
	//��ѯ�Ѵ���Ĺ���
	public List<Fault> FindPended(){
		List<Fault> temp = faultDao.findFaultByState("PENDED");
		//������˳�򽻻�����󱨵Ĺ��Ϸ�����ǰ��
		List<Fault> faults = new ArrayList<Fault>();
		for(int i=temp.size()-1 ; i>=0 ; i--){
			faults.add(temp.get(i));
			temp.remove(i);
		}
		return faults;
	}
	//��ѯ���й���
	public List<Fault> FindPend(){
		List<Fault> temp = faultDao.findAllFault();
		//������˳�򽻻�����󱨵Ĺ��Ϸ�����ǰ��
				List<Fault> faults = new ArrayList<Fault>();
				for(int i=temp.size()-1 ; i>=0 ; i--){
					faults.add(temp.get(i));
					temp.remove(i);
				}
				return faults;
	}
	
	//setterע��
	public FaultDao getFaultDao() {
		return faultDao;
	}

	public void setFaultDao(FaultDao faultDao) {
		this.faultDao = faultDao;
	}
}

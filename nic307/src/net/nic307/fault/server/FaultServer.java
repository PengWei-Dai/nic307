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
 * 对fault的业务层进行封装
 */
public class FaultServer {
	
	//spring注入属性
	private FaultDao faultDao;
	
	//故障申请
	public void ApplyFault(Fault fault){
		faultDao.save(fault);
	}
	
	//查询待处理故障
	public List<Fault> FindPending(){
		List<Fault> temp = faultDao.findFaultByState("PENDING");
		//将故障顺序交换，最后报的故障放在最前面
		List<Fault> faults = new ArrayList<Fault>();
		for(int i=temp.size()-1 ; i>=0 ; i--){
			faults.add(temp.get(i));
			temp.remove(i);
		}
		return faults;
	}
	
	//查询已处理的故障
	public List<Fault> FindPended(){
		List<Fault> temp = faultDao.findFaultByState("PENDED");
		//将故障顺序交换，最后报的故障放在最前面
		List<Fault> faults = new ArrayList<Fault>();
		for(int i=temp.size()-1 ; i>=0 ; i--){
			faults.add(temp.get(i));
			temp.remove(i);
		}
		return faults;
	}
	//查询所有故障
	public List<Fault> FindPend(){
		List<Fault> temp = faultDao.findAllFault();
		//将故障顺序交换，最后报的故障放在最前面
				List<Fault> faults = new ArrayList<Fault>();
				for(int i=temp.size()-1 ; i>=0 ; i--){
					faults.add(temp.get(i));
					temp.remove(i);
				}
				return faults;
	}
	
	//setter注入
	public FaultDao getFaultDao() {
		return faultDao;
	}

	public void setFaultDao(FaultDao faultDao) {
		this.faultDao = faultDao;
	}
}

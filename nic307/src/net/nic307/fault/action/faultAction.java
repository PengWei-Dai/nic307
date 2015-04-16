package net.nic307.fault.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import net.nic307.fault.domain.Fault;
import net.nic307.fault.server.FaultServer;
import net.nic307.util.Constants;
import net.nic307.util.FormatDateTime;

public class faultAction extends ActionSupport {
	/**
	 * @author Rain faultAction�����������������ṩ����
	 */

	// spring Ҫע�������
	private Fault fault;
	private List<Fault> faults;
	private FaultServer faultServer;
	private FormatDateTime formatDateTime;
	// ��������
	private String faultMaster; // ���ϸ�����
	private String faultNumber; // ������ϵ�绰
	private String faultAddress; // ���ϵ�ַ
	private String faultCollege; // ��������ѧԺ
	private String faultHandleTime; // ���ϴ���ʱ��
	private String faultDesc; // ��������
	
	//��������
	public String apply() {
		
		Fault f = this.getInstance();
		faultServer.ApplyFault(f);
		return SUCCESS;
	}
	
	//�����������װ�ɶ���
	public Fault getInstance(){
		//req���ڻ�ȡip��ַ
		HttpServletRequest req = ServletActionContext.getRequest();
		fault.setFaultAddress(faultAddress);
		fault.setFaultCollege(faultCollege);
		fault.setFaultDesc(faultDesc);
		fault.setFaultHandleTime(formatDateTime.getInstance(faultHandleTime));
		fault.setFaultMaster(faultMaster);
		fault.setFaultNumber(faultNumber);
		fault.setFaultIp(req.getRemoteHost());
		fault.setIsFault(0);
		return fault;
	}

//	//��ȡ���ݿ��е�������ʾ��ҳ��
//	public String getPendingFaults(){
//		//��ȡ����֮�󱣴���ֵջ��
//		List<Fault> faults = faultServer.FindPending();
//		//��ȡֵջ
//		ValueStack stack = ActionContext.getContext().getValueStack();
//		//����һ����������ֵ��Map
//		Map<String,Object> context = new HashMap<String,Object>();
//		//����һ������Map��List
//		List<Map> contexts = new ArrayList<Map>();
//	
//		for(int i =0 ;i<faults.size();i++){
//			context.put(Constants.FAULT_ID, faults.get(i).getFaultId());
//			context.put(Constants.FAULT_MASTER, faults.get(i).getFaultMaster());
//			context.put(Constants.FAULT_ADDRESS, faults.get(i).getFaultAddress());
//			context.put(Constants.FAULT_COLLEGE, faults.get(i).getFaultCollege());
//			context.put(Constants.FAULT_NUMBER, faults.get(i).getFaultNumber());
//			context.put(Constants.FAULT_HANDLETIME, faults.get(i).getFaultHandleTime());
//			context.put(Constants.FAULT_NUMBER, faults.get(i).getFaultNumber());
//			context.put(Constants.FAULT_DESC, faults.get(i).getFaultDesc());
//			contexts.add(context);
//		}
//		stack.push(contexts);
//		
//		System.out.println("stack size"+stack.size());
//		return SUCCESS;
//	}
//	
	

	//��ȡδ����Ĺ�����ʾ��ҳ����
	public String getPendingFaults(){
		//��ȡ����֮�󱣴���ֵջ��
		faults = faultServer.FindPending();
		//��ȡֵջ
		ValueStack stack1 = ActionContext.getContext().getValueStack();
		if(faults!= null){
			stack1.push(faults);
		}
		return SUCCESS;
	}
	
	//��ȡ�Ѵ���Ĺ�����ʾ��ҳ����
	public String getPendedFaults(){
		faults=faultServer.FindPended();
		ValueStack stack1 = ActionContext.getContext().getValueStack();
		if(faults!= null){
			stack1.push(faults);
		}
		return SUCCESS;
	}
	
	//��ȡ���й�����ʾ��ҳ����
	public String getPendFaults(){
		faults = faultServer.FindPend();
		ValueStack stack = ActionContext.getContext().getValueStack();
		if(faults!= null){
			stack.push(faults);
		}
		return SUCCESS;
	}
	
	
	
	
	// setterע��
	public Fault getFault() {
		return fault;
	}

	public void setFault(Fault fault) {
		this.fault = fault;
	}

	public FaultServer getFaultServer() {
		return faultServer;
	}

	public void setFaultServer(FaultServer faultServer) {
		this.faultServer = faultServer;
	}

	public FormatDateTime getFormatDateTime() {
		return formatDateTime;
	}

	public void setFormatDateTime(FormatDateTime formatDateTime) {
		this.formatDateTime = formatDateTime;
	}

	public String getFaultMaster() {
		return faultMaster;
	}

	public void setFaultMaster(String faultMaster) {
		this.faultMaster = faultMaster;
	}

	public String getFaultNumber() {
		return faultNumber;
	}

	public void setFaultNumber(String faultNumber) {
		this.faultNumber = faultNumber;
	}

	public String getFaultAddress() {
		return faultAddress;
	}

	public void setFaultAddress(String faultAddress) {
		this.faultAddress = faultAddress;
	}

	public String getFaultCollege() {
		return faultCollege;
	}

	public void setFaultCollege(String faultCollege) {
		this.faultCollege = faultCollege;
	}

	public String getFaultHandleTime() {
		return faultHandleTime;
	}

	public void setFaultHandleTime(String faultHandleTime) {
		this.faultHandleTime = faultHandleTime;
	}

	public String getFaultDesc() {
		return faultDesc;
	}

	public void setFaultDesc(String faultDesc) {
		this.faultDesc = faultDesc;
	}

	public List<Fault> getFaults() {
		return faults;
	}

	public void setFaults(List<Fault> faults) {
		this.faults = faults;
	}
	
	
	
	
}

/**
 * 
 */
package net.nic307.fault.domain;

import java.util.Date;

/**
 * @author Rain
 *  ������
 */
public class Fault {
	
	private String faultId;
	private String faultMaster;   //���ϸ�����
	private String faultNumber;   //������ϵ�绰
	private String faultAddress;  //���ϵ�ַ
	private Date faultHandleTime;   //���ϴ���ʱ��
	private String faultDesc;    //��������
	private String faultIp;    //�����걨��ip��ַ
	
	public Fault(){};
	
	
	//���Ե�Getter and Setter
	public String getFaultId() {
		return faultId;
	}
	public void setFaultId(String faultId) {
		this.faultId = faultId;
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
	public Date getFaultHandleTime() {
		return faultHandleTime;
	}
	public void setFaultHandleTime(Date faultHandleTime) {
		this.faultHandleTime = faultHandleTime;
	}
	public String getFaultDesc() {
		return faultDesc;
	}
	public void setFaultDesc(String faultDesc) {
		this.faultDesc = faultDesc;
	}
	public String getFaultIp() {
		return faultIp;
	}
	public void setFaultIp(String faultIp) {
		this.faultIp = faultIp;
	}
	
	
}

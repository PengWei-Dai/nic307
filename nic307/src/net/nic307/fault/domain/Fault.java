/**
 * 
 */
package net.nic307.fault.domain;

import java.util.Date;

/**
 * @author Rain
 *  故障类
 */
public class Fault {
	
	private String faultId;
	private String faultMaster;   //故障负责人
	private String faultNumber;   //故障联系电话
	private String faultAddress;  //故障地址
	private Date faultHandleTime;   //故障处理时间
	private String faultDesc;    //故障描述
	private String faultIp;    //故障申报的ip地址
	
	public Fault(){};
	
	
	//属性的Getter and Setter
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

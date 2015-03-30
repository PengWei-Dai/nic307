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
	
	public static final int PENDING=0;   //用于标记故障为处理
	public static final int PENDED=1;    //用于标记故障已处理
	
	
	private int faultId;
	private String faultMaster;   //故障负责人
	private String faultNumber;   //故障联系电话
	private String faultAddress;  //故障地址
	private String faultCollege;   //故障所属学院
	private String faultHandleTime;   //故障处理时间
	private String faultDesc;    //故障描述
	private String faultIp;    //故障申报的ip地址
	private int isFault;    //用于标记故障是否被处理
							//  0  未处理  1:已处理
	
	
	public Fault(){};
	
	
	//属性的Getter and Setter
	public int getFaultId() {
		return faultId;
	}
	public void setFaultId(int faultId) {
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
	public String getFaultIp() {
		return faultIp;
	}
	public void setFaultIp(String faultIp) {
		this.faultIp = faultIp;
	}


	public int getIsFault() {
		return isFault;
	}


	public void setIsFault(int isFault) {
		this.isFault = isFault;
	}


	public String getFaultCollege() {
		return faultCollege;
	}


	public void setFaultCollege(String faultCollege) {
		this.faultCollege = faultCollege;
	}
	
	
}

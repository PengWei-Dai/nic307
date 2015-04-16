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
	
	public static final int PENDING=0;   //���ڱ�ǹ���Ϊ����
	public static final int PENDED=1;    //���ڱ�ǹ����Ѵ���
	
	
	private int faultId;
	private String faultMaster;   //���ϸ�����
	private String faultNumber;   //������ϵ�绰
	private String faultAddress;  //���ϵ�ַ
	private String faultCollege;   //��������ѧԺ
	private String faultHandleTime;   //���ϴ���ʱ��
	private String faultDesc;    //��������
	private String faultIp;    //�����걨��ip��ַ
	private int isFault;    //���ڱ�ǹ����Ƿ񱻴���
							//  0  δ����  1:�Ѵ���
	
	
	public Fault(){};
	
	
	//���Ե�Getter and Setter
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

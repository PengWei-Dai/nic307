/**
 * 
 */
package net.nic307.user.domain;

/**
 * @author Rain
 * ������һ��User��Ϣ�Ĳ����࣬Um ��ʾ��userMoreInfo
 */
public class Umi {
	public Umi(){}
	
	private int umiId;
	private String umiHead;   //�û�ͷ��
	private String umiProfession;     //�û����ڵ���ҵ
	private String umiAddr;   //�û�������סַ
	
	private int umiPoint;   //�û��ڸ�ϵͳ�еĻ���
	private String umiIntr;   //�û����
	private String umiCompany;    //�û��������ڵĹ�˾
	private String umiJob;     //�û�����������ְλ
	
	private User user;    //user������Ϣ����

	public int getUmiId() {
		return umiId;
	}
	public void setUmiId(int umiId) {
		this.umiId = umiId;
	}
	public String getUmiHead() {
		return umiHead;
	}
	public void setUmiHead(String umiHead) {
		this.umiHead = umiHead;
	}
	public String getUmiProfession() {
		return umiProfession;
	}
	public void setUmiProfession(String umiProfession) {
		this.umiProfession = umiProfession;
	}
	public String getUmiAddr() {
		return umiAddr;
	}
	public void setUmiAddr(String umiAddr) {
		this.umiAddr = umiAddr;
	}
	public int getUmiPoint() {
		return umiPoint;
	}
	public void setUmiPoint(int umiPoint) {
		this.umiPoint = umiPoint;
	}
	public String getUmiIntr() {
		return umiIntr;
	}
	public void setUmiIntr(String umiIntr) {
		this.umiIntr = umiIntr;
	}
	public String getUmiCompany() {
		return umiCompany;
	}
	public void setUmiCompany(String umiCompany) {
		this.umiCompany = umiCompany;
	}
	public String getUmiJob() {
		return umiJob;
	}
	public void setUmiJob(String umiJob) {
		this.umiJob = umiJob;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}

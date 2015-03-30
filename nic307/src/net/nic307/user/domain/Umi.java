/**
 * 
 */
package net.nic307.user.domain;

/**
 * @author Rain
 * ：这是一个User信息的补充类，Um 表示：userMoreInfo
 */
public class Umi {
	public Umi(){}
	
	private int umiId;
	private String umiHead;   //用户头像
	private String umiProfession;     //用户现在的行业
	private String umiAddr;   //用户的现在住址
	
	private int umiPoint;   //用户在该系统中的积分
	private String umiIntr;   //用户简介
	private String umiCompany;    //用户现在所在的公司
	private String umiJob;     //用户现在所处的职位
	
	private User user;    //user基本信息引用

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

/**
 * 
 */
package net.nic307.dynamic.domain;

/**
 * @author Rain
 *	这是一个话题和文章的基类
 */
public class Dynamic {
	private int dynamicId;
	private String dynamicAuthor;   //发表动态的作者
	private int dynamicCommentCount;    //动态的回复数量
	private int dynamicConcernCount;    //动态的关注数
	private String dynamicDate;    //动态的发表时间 
	private int daynamicLike;    //赞！
	
	public int getDynamicId() {
		return dynamicId;
	}
	public void setDynamicId(int dynamicId) {
		this.dynamicId = dynamicId;
	}
	public String getDynamicAuthor() {
		return dynamicAuthor;
	}
	public void setDynamicAuthor(String dynamicAuthor) {
		this.dynamicAuthor = dynamicAuthor;
	}
	public int getDynamicCommentCount() {
		return dynamicCommentCount;
	}
	public void setDynamicCommentCount(int dynamicCommentCount) {
		this.dynamicCommentCount = dynamicCommentCount;
	}
	public int getDynamicConcernCount() {
		return dynamicConcernCount;
	}
	public void setDynamicConcernCount(int dynamicConcernCount) {
		this.dynamicConcernCount = dynamicConcernCount;
	}
	public int getDaynamicLike() {
		return daynamicLike;
	}
	public void setDaynamicLike(int daynamicLike) {
		this.daynamicLike = daynamicLike;
	}
	public String getDynamicDate() {
		return dynamicDate;
	}
	public void setDynamicDate(String dynamicDate) {
		this.dynamicDate = dynamicDate;
	}
	
	
}

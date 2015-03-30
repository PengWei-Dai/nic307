/**
 * 
 */
package net.nic307.dynamic.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Rain
 *
 */
public class PublishAction extends ActionSupport{
	private String category;
	private String title;
	private String content;
	@Override
	public String execute() throws Exception {
		System.out.println("Category:"+category);
		System.out.println("Title:"+title);
		System.out.println("Content:"+content);
		
		
		return SUCCESS;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}

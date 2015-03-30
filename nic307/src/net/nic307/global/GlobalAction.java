/**
 *为页面上的页面跳转，并且在跳转的时候经行请求处理
 */
package net.nic307.global;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Rain
 *
 */
public class GlobalAction extends ActionSupport{
	
	public String GlobalRedirect(){
		System.out.println("Hello GlobalAction");
		return SUCCESS;
	}
}

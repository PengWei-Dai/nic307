/**
 *Ϊҳ���ϵ�ҳ����ת����������ת��ʱ����������
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

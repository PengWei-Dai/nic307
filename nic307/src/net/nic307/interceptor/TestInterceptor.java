/**
 * 
 */
package net.nic307.interceptor;

import java.util.Map;

import net.nic307.util.Constants;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Rain
 * ≤‚ ‘”√¿˝
 */
public class TestInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invock) throws Exception {
		System.out.println("Begin Invocation!");
		Map session = invock.getInvocationContext().getSession();
		if(session.isEmpty())
		{
			System.out.println("null");
			return Action.LOGIN;
		}else
			return invock.invoke();
	}
	
}

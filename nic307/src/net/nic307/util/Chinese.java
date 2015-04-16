/**
 * 
 */
package net.nic307.util;

/**
 * @author Rain
 * ������룬��������ת��
 */
public class Chinese {
	public static String toChinese(String strValue){
		try{
			if(strValue == null){
				return "";
			}else{
				return new String(strValue.getBytes("ISO8859_1"),"GBK");
			}
		}catch(Exception e){
			return "";
		}
	}
}

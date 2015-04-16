/**
 * 
 */
package net.nic307.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author Rain
 * ʱ���ʽ������
 *
 */
public class FormatDateTime {
	@SuppressWarnings("deprecation")

	public String getInstance(String time1){
		String time =time1;
		String myTime ="";
		switch (time) {
		case "now":
			SimpleDateFormat myFmt=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��");
			Date now=new Date();
			myTime =myFmt.format(now);
			break;
		case "tomorrowMorning":
			Calendar c = Calendar.getInstance();
			myTime =( c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+(c.get(Calendar.DAY_OF_MONTH)+1)+"��"
					+"08ʱ"+"15��");
			break;
		case "todayAfter":
			Calendar c1 = Calendar.getInstance();
			myTime =( c1.get(Calendar.YEAR)+"��"+(c1.get(Calendar.MONTH)+1)+"��"+(c1.get(Calendar.DAY_OF_MONTH))+"��"
					+"14ʱ"+"30��");
			break;
		}
		
		return myTime;
	}
}

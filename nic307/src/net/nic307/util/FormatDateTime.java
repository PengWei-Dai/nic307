/**
 * 
 */
package net.nic307.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author Rain
 * 时间格式工具类
 *
 */
public class FormatDateTime {
	@SuppressWarnings("deprecation")

	public String getInstance(String time1){
		String time =time1;
		String myTime ="";
		switch (time) {
		case "now":
			SimpleDateFormat myFmt=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
			Date now=new Date();
			myTime =myFmt.format(now);
			break;
		case "tomorrowMorning":
			Calendar c = Calendar.getInstance();
			myTime =( c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+(c.get(Calendar.DAY_OF_MONTH)+1)+"日"
					+"08时"+"15分");
			break;
		case "todayAfter":
			Calendar c1 = Calendar.getInstance();
			myTime =( c1.get(Calendar.YEAR)+"年"+(c1.get(Calendar.MONTH)+1)+"月"+(c1.get(Calendar.DAY_OF_MONTH))+"日"
					+"14时"+"30分");
			break;
		}
		
		return myTime;
	}
}

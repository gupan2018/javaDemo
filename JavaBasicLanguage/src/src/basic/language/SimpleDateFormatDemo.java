package src.basic.language;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat类使用详解
 * 根据给定日期格式将String与Date象相互转换
 * 
 * @author Think
 *
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date now = new Date();
		
		// 设置日期格式
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// 时间格式铬字符串间的转换
		String tiemStr2 = sdf2.format(now);
		System.out.println(tiemStr2);
		
		/*
		 * 16天5小时23分40秒以后的时间
		 */
		long time = now.getTime();
		time += 1000* 60 * 60 * 24 * 16;
		time += 1000* 60 * 60 * 5;
		time += 1000* 60 * 23;
		time += 1000* 40;
		now.setTime(time);
		System.out.println(sdf2.format(now));
		
		/*
		 * 将给定的字符串按照SimpleDateFormat指定的日期格式解析为一个对象
		 */
		
		// str向int转换
		String str = "2007-09-12 20:23:12";
		Date date = sdf2.parse(str);
		System.out.println(date);
	}
}

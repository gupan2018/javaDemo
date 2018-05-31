package src.basic.language;

import java.util.Date;

/**
 * 这个类是描述时间操作Date类的函数
 * 
 * 有与Date类的设计缺陷（时区、千年虫），所以他的大部分方法被设置为过时的，不建议使用
 * @author Think
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		/*
		 * 设置时间
		 */
		
		// 获得Date内部维护的long值
		long time = now.getTime();
		System.out.println(time);
		// 设置时间偏移
		time += 1000 * 60 * 60 * 24;
		/*
		 * void setTime()
		 */
		now.setTime(time);
		System.out.println(now);
		
	}

}

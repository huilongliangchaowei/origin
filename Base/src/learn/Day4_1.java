package learn;

import java.util.Date;

/**
 * Date类
 * 
 * */
public class Day4_1 {
	
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		d1.setTime(1000);   //设置毫秒值改变时间对象
		System.out.println(d1);
		
		Date d2 = new Date(0);
		System.out.println(d2);  //1970y7m7d中国属于东八区所以是8点
		
		System.out.println(d1.getTime());  //获取1970年1月1日到现在的毫秒数
		System.out.println(System.currentTimeMillis());  //上同
	}

}

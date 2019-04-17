package learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 来到这个世界多少天
 * 
 * 1.将生日和今天写为字符串写入String
 * 2.定义日期格式化对象
 * 3.将日期转化为date
 * 4.将毫秒转为天数
 * */
public class Day4_3Test {

	public static void main(String[] args) throws ParseException {
		String birthday = "1995年8月8日";
		String today = "2019年3月3日";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time/1000/60/60/24);
 		
	}

}

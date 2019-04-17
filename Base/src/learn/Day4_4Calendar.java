package learn;

import java.util.Calendar;

public class Day4_4Calendar {

	public static void main(String[] args) {
		
		 Calendar righeNow = Calendar.getInstance(); //替代Date的类
		 System.out.println(righeNow);
		 System.out.println(righeNow.get(Calendar.YEAR));  //通过字段获取年
		 System.out.println(righeNow.get(Calendar.MONTH));  //获取月应该做+1操作
		 System.out.println(righeNow.get(Calendar.DAY_OF_MONTH));
		 System.out.println(righeNow.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 
		 System.out.println(righeNow.get(Calendar.YEAR)+"年"+getNum((righeNow.get(Calendar.MONTH)+1))+"月"
		 +getNum(righeNow.get(Calendar.DAY_OF_MONTH))+"日"+getWeek(righeNow.get(Calendar.DAY_OF_WEEK)));
	}
	
	/*
	 * 个位的数字前面补0
	 * 
	 * 1.返回值类型String
	 * 2.参数列表int num 
	 * */
	public static String getWeek(int num) {
		String[] arr = {"" ,"周日","周一","周二","周三","周四","周五","周六"};
		return arr[num];
	}
	public static String getNum(int num) {
		if (num>9) {
			return ""+num;
		}else {
			return "0"+num;
		}
	}

}

package learn;

import java.math.BigDecimal;

/**
 * BigDecimal 更精确的整数
 * 
 * 
 * */
public class day3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2.0-1.1);   //二进制表示小数的精确性不够
		
		BigDecimal bigDecimal = new  BigDecimal(2.0);
		BigDecimal bigDecimal2 = new  BigDecimal(1.1);
		System.out.println(bigDecimal.subtract(bigDecimal2));  //稍微精确一些
		
		BigDecimal bigDecimal1 = new  BigDecimal("2.0");
		BigDecimal bigDecimal12 = new  BigDecimal("1.1");
		System.out.println(bigDecimal1.subtract(bigDecimal12));  //最精确
		
		BigDecimal bd1 = BigDecimal.valueOf(2.0);     //此方法道理同上
		BigDecimal bd2 = BigDecimal.valueOf(1.1);
		System.out.println(bd1.subtract(bd2));
	}

}

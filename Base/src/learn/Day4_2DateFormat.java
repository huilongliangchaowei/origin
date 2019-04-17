package learn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat  是抽象类不允许初始化
 * 
 * 
 * 
 * */
public class Day4_2DateFormat {

	public static void main(String[] args) throws ParseException {
		//DateFormat df1 = new SimpleDateFormat();  
		//DateFormat dF = DateFormat.getDateInstance();  //返回一个SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");  //创建日期格式化类对象
		Date d1 = new Date(); //获取当前时间对象
		sdf.format(d1);
		System.out.println(sdf.format(d1));
		
		String string = "2019年04月17日20:05:25";   //将格式化日期转化为date格式
		SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		Date d3 = sdfDateFormat.parse(string);
		System.out.println(d3.getTime());

	}

}

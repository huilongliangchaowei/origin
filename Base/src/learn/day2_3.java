package learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day2_3 {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("a*b"); //获取正则表达式	
//		Matcher matcher  = p.matcher("aaaab"); //获取匹配器
//		boolean b = matcher.matches(); //看是否匹配
//		System.out.println(b);
//		
//		//等同于
//		
//		System.out.println("aaaab".matches("a*b"));
		
		String string =  "我的手机号码是185858585858,还有186868686868,还有187878787878";
		String regex = "1[3578]\\d{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {//查找,
			System.out.println(matcher.group());//过滤,必须先查找
		}
	}

}

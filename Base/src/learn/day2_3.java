package learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day2_3 {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("a*b"); //��ȡ������ʽ	
//		Matcher matcher  = p.matcher("aaaab"); //��ȡƥ����
//		boolean b = matcher.matches(); //���Ƿ�ƥ��
//		System.out.println(b);
//		
//		//��ͬ��
//		
//		System.out.println("aaaab".matches("a*b"));
		
		String string =  "�ҵ��ֻ�������185858585858,����186868686868,����187878787878";
		String regex = "1[3578]\\d{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(string);
		while (matcher.find()) {//����,
			System.out.println(matcher.group());//����,�����Ȳ���
		}
	}

}

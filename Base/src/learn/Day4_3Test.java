package learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����������������
 * 
 * 1.�����պͽ���дΪ�ַ���д��String
 * 2.�������ڸ�ʽ������
 * 3.������ת��Ϊdate
 * 4.������תΪ����
 * */
public class Day4_3Test {

	public static void main(String[] args) throws ParseException {
		String birthday = "1995��8��8��";
		String today = "2019��3��3��";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time/1000/60/60/24);
 		
	}

}

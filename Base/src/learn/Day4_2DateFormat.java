package learn;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFormat  �ǳ����಻�����ʼ��
 * 
 * 
 * 
 * */
public class Day4_2DateFormat {

	public static void main(String[] args) throws ParseException {
		//DateFormat df1 = new SimpleDateFormat();  
		//DateFormat dF = DateFormat.getDateInstance();  //����һ��SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");  //�������ڸ�ʽ�������
		Date d1 = new Date(); //��ȡ��ǰʱ�����
		sdf.format(d1);
		System.out.println(sdf.format(d1));
		
		String string = "2019��04��17��20:05:25";   //����ʽ������ת��Ϊdate��ʽ
		SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
		Date d3 = sdfDateFormat.parse(string);
		System.out.println(d3.getTime());

	}

}

package learn;

import java.util.Date;

/**
 * Date��
 * 
 * */
public class Day4_1 {
	
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		d1.setTime(1000);   //���ú���ֵ�ı�ʱ�����
		System.out.println(d1);
		
		Date d2 = new Date(0);
		System.out.println(d2);  //1970y7m7d�й����ڶ�����������8��
		
		System.out.println(d1.getTime());  //��ȡ1970��1��1�յ����ڵĺ�����
		System.out.println(System.currentTimeMillis());  //��ͬ
	}

}

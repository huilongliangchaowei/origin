package learn;

import java.util.Calendar;

public class Day4_4Calendar {

	public static void main(String[] args) {
		
		 Calendar righeNow = Calendar.getInstance(); //���Date����
		 System.out.println(righeNow);
		 System.out.println(righeNow.get(Calendar.YEAR));  //ͨ���ֶλ�ȡ��
		 System.out.println(righeNow.get(Calendar.MONTH));  //��ȡ��Ӧ����+1����
		 System.out.println(righeNow.get(Calendar.DAY_OF_MONTH));
		 System.out.println(righeNow.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 
		 System.out.println(righeNow.get(Calendar.YEAR)+"��"+getNum((righeNow.get(Calendar.MONTH)+1))+"��"
		 +getNum(righeNow.get(Calendar.DAY_OF_MONTH))+"��"+getWeek(righeNow.get(Calendar.DAY_OF_WEEK)));
	}
	
	/*
	 * ��λ������ǰ�油0
	 * 
	 * 1.����ֵ����String
	 * 2.�����б�int num 
	 * */
	public static String getWeek(int num) {
		String[] arr = {"" ,"����","��һ","�ܶ�","����","����","����","����"};
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

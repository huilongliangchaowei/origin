package learn;

import java.math.BigDecimal;

/**
 * BigDecimal ����ȷ������
 * 
 * 
 * */
public class day3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2.0-1.1);   //�����Ʊ�ʾС���ľ�ȷ�Բ���
		
		BigDecimal bigDecimal = new  BigDecimal(2.0);
		BigDecimal bigDecimal2 = new  BigDecimal(1.1);
		System.out.println(bigDecimal.subtract(bigDecimal2));  //��΢��ȷһЩ
		
		BigDecimal bigDecimal1 = new  BigDecimal("2.0");
		BigDecimal bigDecimal12 = new  BigDecimal("1.1");
		System.out.println(bigDecimal1.subtract(bigDecimal12));  //�ȷ
		
		BigDecimal bd1 = BigDecimal.valueOf(2.0);     //�˷�������ͬ��
		BigDecimal bd2 = BigDecimal.valueOf(1.1);
		System.out.println(bd1.subtract(bd2));
	}

}

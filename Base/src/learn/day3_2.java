package learn;

import java.util.Random;

/**
 * random Ӧ��
 * 
 * 
 * */
public class day3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random  = new Random();
		int x = random.nextInt(100);	//�����㵽��ʮ��֮��������
		System.out.println(x);
		System.out.println(Math.random());
		
		Random random2 = new  Random(1000);  //ָ�����ӵ������ÿһ�����ж�һ��
		System.out.println(random2.nextInt());
	}

}

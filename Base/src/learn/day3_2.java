package learn;

import java.util.Random;

/**
 * random 应用
 * 
 * 
 * */
public class day3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random  = new Random();
		int x = random.nextInt(100);	//生成零到九十九之间的随机数
		System.out.println(x);
		System.out.println(Math.random());
		
		Random random2 = new  Random(1000);  //指定种子的随机数每一次运行都一样
		System.out.println(random2.nextInt());
	}

}

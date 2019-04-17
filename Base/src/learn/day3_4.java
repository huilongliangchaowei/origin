package learn;

import java.math.BigInteger;

/**
 * BigInteger 的用法
 * 
 * */

public class day3_4 {

	public static void main(String[] args) {
		// int 的数据长度小于 long 小于 BigInteger
		BigInteger bilBigInteger = new BigInteger("122334654646456544");
		BigInteger bigInteger = new BigInteger("214211212");
		
		System.out.println(bigInteger.add(bilBigInteger));  //+
		System.out.println(bigInteger.subtract(bilBigInteger));  //-
		System.out.println(bigInteger.multiply(bilBigInteger));  //*
		System.out.println(bigInteger.divide(bilBigInteger));  //除
		
		BigInteger[] arr = bilBigInteger.divideAndRemainder(bigInteger); //取除数和余数
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

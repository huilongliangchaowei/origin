package learn;

import java.math.BigInteger;

/**
 * BigInteger ���÷�
 * 
 * */

public class day3_4 {

	public static void main(String[] args) {
		// int �����ݳ���С�� long С�� BigInteger
		BigInteger bilBigInteger = new BigInteger("122334654646456544");
		BigInteger bigInteger = new BigInteger("214211212");
		
		System.out.println(bigInteger.add(bilBigInteger));  //+
		System.out.println(bigInteger.subtract(bilBigInteger));  //-
		System.out.println(bigInteger.multiply(bilBigInteger));  //*
		System.out.println(bigInteger.divide(bilBigInteger));  //��
		
		BigInteger[] arr = bilBigInteger.divideAndRemainder(bigInteger); //ȡ����������
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

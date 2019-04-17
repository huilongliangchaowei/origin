package learn;

import java.util.Arrays;

/*
 * ÇÐ¸î×Ö·û´® 91 27 46 38 50 Êä³ö½á¹û27 38 46 91
 * 
 * */
public class day2_1 {

	public static void main(String[] args) {
		String string = "91 27 46 38 50";
		String[] ss = string.split(" ");
		int[] arr = new int[ss.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(ss[i]);
		}
		//ÅÅÐò
		Arrays.sort(arr);
		
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				sBuilder.append(arr[i]);
			}else {
				sBuilder.append(arr[i]+" ");
			}
		}
		System.out.println(sBuilder);
	}

}

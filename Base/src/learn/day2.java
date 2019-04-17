package learn;

public class day2 {

	public static void main(String[] args) {
		
		String str = "我我我爱爱爱爱爱爱北北北北北京京京京天天天天安安安安门门门门";
		String S1 = str.replaceAll("(.)\\1+","$1");
		System.out.println(S1);
		day2 day2 = new day2();
		day2.split();
	}
	
	public void split() {
		 String string = "金三胖.郭美美.李天一";
		 String regex = "\\.";
		 String[] ss = string.split(regex);
		 for (int i = 0; i < ss.length; i++) {
			 
			 System.out.println(ss[i]);
			
		}
	}

}

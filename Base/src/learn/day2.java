package learn;

public class day2 {

	public static void main(String[] args) {
		
		String str = "�����Ұ������������������������������������찲��������������";
		String S1 = str.replaceAll("(.)\\1+","$1");
		System.out.println(S1);
		day2 day2 = new day2();
		day2.split();
	}
	
	public void split() {
		 String string = "������.������.����һ";
		 String regex = "\\.";
		 String[] ss = string.split(regex);
		 for (int i = 0; i < ss.length; i++) {
			 
			 System.out.println(ss[i]);
			
		}
	}

}

package learn;
/*
 * ������ʽ�滻
 * 
 * 
 * */
public class day2_2 {

	public static void main(String[] args) {
	String string = "woaibe3ijngti2annamen";
	String s2 = string.replaceAll("\\d", "");
	System.out.println(s2);
	day2_2 aDay2_2 = new day2_2();
	aDay2_2.replice();
	aDay2_2.replice2();
	aDay2_2.spilt();
	}
	public void replice() {
		
		String regex = "(.)\\1(.)\\2"; //\\1�����һ�����ظ�����һ��,\\2��ʾ�ڶ����ٳ���һ��
		System.out.println("�������".matches(regex));
		
	}
	
	public void replice2() {
			
			String regex = "(..)\\1"; //\\1�����һ�����ظ�����һ��,
		System.out.println("���ֿ���".matches(regex));
		
	}
	public void spilt() {
			
			String regex = "(.)\\1+"; //\\1�����һ�����ظ�����һ��,\\2��ʾ�ڶ����ٳ���һ��
			String s   = "annjshhhkaklklljskiiikskkk";
			String[] string = s.split(regex);
			for (int i = 0; i < string.length; i++) {
				System.out.println(string[i]);
			}
			
		}
}

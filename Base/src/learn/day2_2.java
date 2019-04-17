package learn;
/*
 * 正则表达式替换
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
		
		String regex = "(.)\\1(.)\\2"; //\\1代表第一组再重复出现一次,\\2表示第二组再出现一次
		System.out.println("快快乐乐".matches(regex));
		
	}
	
	public void replice2() {
			
			String regex = "(..)\\1"; //\\1代表第一组再重复出现一次,
		System.out.println("快乐快乐".matches(regex));
		
	}
	public void spilt() {
			
			String regex = "(.)\\1+"; //\\1代表第一组再重复出现一次,\\2表示第二组再出现一次
			String s   = "annjshhhkaklklljskiiikskkk";
			String[] string = s.split(regex);
			for (int i = 0; i < string.length; i++) {
				System.out.println(string[i]);
			}
			
		}
}

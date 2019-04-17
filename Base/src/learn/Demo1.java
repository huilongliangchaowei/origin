package learn;

import java.awt.TexturePaint;
/*正则表达式,基础式
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkQQ("12345679"));
		
//		String reger = "[1-9]\\d{4,14}";
//		System.out.println("123456789".matches(reger));
		
//		String regex = "[a-z]";                    //a-z的字母单字节
//		System.out.println("c".matches(regex));
//		System.out.println("0".matches(regex));
//		System.out.println("A".matches(regex));
		
//		String regex = "[a-zA-Z]";                //a-z或A-Z的单字节
//		System.out.println("S".matches(regex));
//		System.out.println("a".matches(regex));
//		System.out.println("1".matches(regex));
		
//		String regex = "[a-z&&[def]]";           //a-z中包括def的部分
//		System.out.println("d".matches(regex));
//		System.out.println("e".matches(regex));
//		System.out.println("f".matches(regex));
//		System.out.println("a".matches(regex));
	
//		String regex = "[a-z&&[^df]]";           //a-z中除去df的部分
//		System.out.println("d".matches(regex));
//		System.out.println("f".matches(regex));
//		System.out.println("e".matches(regex));
		
//		String regex = "[a-z&&[^m-p]]";          //a-z中除去m-p的部分
//		System.out.println("m".matches(regex));
//		System.out.println("o".matches(regex));
//		System.out.println("p".matches(regex));
//		System.out.println("a".matches(regex));
		
//		String regex = ".";						//.代表所有单字符
//		System.out.println("5".matches(regex));
//		System.out.println("%".matches(regex));
		
//		String regex = "\\d";					//\d代表0-9中任意单字符
//		System.out.println("2".matches(regex));
//		System.out.println("0".matches(regex));
//		System.out.println("@".matches(regex));
//		System.out.println("a".matches(regex));
		
//		String regex = "\\D";                   //\D代表除0-9之外的数字
//		System.out.println("a".matches(regex));
//		System.out.println("0".matches(regex));
		
//		String regex = "\\s";					//代表空白单字符
//		System.out.println("".matches(regex));
//		System.out.println(" ".matches(regex));  //一个空格
//		System.out.println("	".matches(regex)); //一个tab键
//		System.out.println("    ".matches(regex));//四个空格键
		
//		String regex = "\\S"; //非空白单字符
//		System.out.println("".matches(regex));
//		System.out.println(" ".matches(regex));
//		System.out.println("1".matches(regex));
//		System.out.println("%".matches(regex));
		
//		String regex = "\\w";					//单词字符/非符号
//		System.out.println("a".matches(regex));
//		System.out.println("0".matches(regex));
//		System.out.println("*".matches(regex));
//		System.out.println("A".matches(regex));
		
//		String regex = "\\W";					//非单词字符
//		System.out.println("%".matches(regex));
//		System.out.println("$".matches(regex));
//		System.out.println("!".matches(regex));
//		System.out.println("Q".matches(regex));
//		System.out.println("1".matches(regex));
		
//		String regex = "[abc]?";				//abc仅出现一次或一次也没有
//		System.out.println("a".matches(regex));
//		System.out.println("n".matches(regex));
//		System.out.println("".matches(regex));

//		String regex = "[abc]*";				//abc出现0次或多次
//		System.out.println("acbc".matches(regex));
//		System.out.println("a".matches(regex));
//		System.out.println("".matches(regex));
//		System.out.println("ads".matches(regex));
		
//		String regex = "[abc]+";				//一次或多次
//		System.out.println("".matches(regex));
//		System.out.println("abcabc".matches(regex));
//		System.out.println("ab".matches(regex));
		
//		String regex = "[abc]{2,}";				//包含abc中的任意两个或以上
//		System.out.println("a".matches(regex));
//		System.out.println("abc".matches(regex));
//		System.out.println("abcabc".matches(regex));
		
//		String regex = "[abc]{2}";				//包含abc任意两个
//		System.out.println("ab".matches(regex));
		
//		String regex = "[abc]{2,5}";			//包含abc2-5个
//		System.out.println("abcac".matches(regex));
//		System.out.println("acabcaba".matches(regex));
		
		
	}
	
	public static  boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.startsWith("0")) {//验证是否0开头
			flag = false;
		}else {
			if(qq.length() >= 5 && qq.length() <= 15) {
				char[] arr = qq.toCharArray();
				for(int i = 0;i < qq.length(); i++) {
					char ch = arr[i];
					if(!(ch >= '0' && ch <= '9')){
						flag = false;
						break;
					}
				}
			}else {
				flag = false;
			}
		}
		return flag;
		
	}
}

package learn;

import java.awt.TexturePaint;
/*������ʽ,����ʽ
 * */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(checkQQ("12345679"));
		
//		String reger = "[1-9]\\d{4,14}";
//		System.out.println("123456789".matches(reger));
		
//		String regex = "[a-z]";                    //a-z����ĸ���ֽ�
//		System.out.println("c".matches(regex));
//		System.out.println("0".matches(regex));
//		System.out.println("A".matches(regex));
		
//		String regex = "[a-zA-Z]";                //a-z��A-Z�ĵ��ֽ�
//		System.out.println("S".matches(regex));
//		System.out.println("a".matches(regex));
//		System.out.println("1".matches(regex));
		
//		String regex = "[a-z&&[def]]";           //a-z�а���def�Ĳ���
//		System.out.println("d".matches(regex));
//		System.out.println("e".matches(regex));
//		System.out.println("f".matches(regex));
//		System.out.println("a".matches(regex));
	
//		String regex = "[a-z&&[^df]]";           //a-z�г�ȥdf�Ĳ���
//		System.out.println("d".matches(regex));
//		System.out.println("f".matches(regex));
//		System.out.println("e".matches(regex));
		
//		String regex = "[a-z&&[^m-p]]";          //a-z�г�ȥm-p�Ĳ���
//		System.out.println("m".matches(regex));
//		System.out.println("o".matches(regex));
//		System.out.println("p".matches(regex));
//		System.out.println("a".matches(regex));
		
//		String regex = ".";						//.�������е��ַ�
//		System.out.println("5".matches(regex));
//		System.out.println("%".matches(regex));
		
//		String regex = "\\d";					//\d����0-9�����ⵥ�ַ�
//		System.out.println("2".matches(regex));
//		System.out.println("0".matches(regex));
//		System.out.println("@".matches(regex));
//		System.out.println("a".matches(regex));
		
//		String regex = "\\D";                   //\D�����0-9֮�������
//		System.out.println("a".matches(regex));
//		System.out.println("0".matches(regex));
		
//		String regex = "\\s";					//����հ׵��ַ�
//		System.out.println("".matches(regex));
//		System.out.println(" ".matches(regex));  //һ���ո�
//		System.out.println("	".matches(regex)); //һ��tab��
//		System.out.println("    ".matches(regex));//�ĸ��ո��
		
//		String regex = "\\S"; //�ǿհ׵��ַ�
//		System.out.println("".matches(regex));
//		System.out.println(" ".matches(regex));
//		System.out.println("1".matches(regex));
//		System.out.println("%".matches(regex));
		
//		String regex = "\\w";					//�����ַ�/�Ƿ���
//		System.out.println("a".matches(regex));
//		System.out.println("0".matches(regex));
//		System.out.println("*".matches(regex));
//		System.out.println("A".matches(regex));
		
//		String regex = "\\W";					//�ǵ����ַ�
//		System.out.println("%".matches(regex));
//		System.out.println("$".matches(regex));
//		System.out.println("!".matches(regex));
//		System.out.println("Q".matches(regex));
//		System.out.println("1".matches(regex));
		
//		String regex = "[abc]?";				//abc������һ�λ�һ��Ҳû��
//		System.out.println("a".matches(regex));
//		System.out.println("n".matches(regex));
//		System.out.println("".matches(regex));

//		String regex = "[abc]*";				//abc����0�λ���
//		System.out.println("acbc".matches(regex));
//		System.out.println("a".matches(regex));
//		System.out.println("".matches(regex));
//		System.out.println("ads".matches(regex));
		
//		String regex = "[abc]+";				//һ�λ���
//		System.out.println("".matches(regex));
//		System.out.println("abcabc".matches(regex));
//		System.out.println("ab".matches(regex));
		
//		String regex = "[abc]{2,}";				//����abc�е���������������
//		System.out.println("a".matches(regex));
//		System.out.println("abc".matches(regex));
//		System.out.println("abcabc".matches(regex));
		
//		String regex = "[abc]{2}";				//����abc��������
//		System.out.println("ab".matches(regex));
		
//		String regex = "[abc]{2,5}";			//����abc2-5��
//		System.out.println("abcac".matches(regex));
//		System.out.println("acabcaba".matches(regex));
		
		
	}
	
	public static  boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.startsWith("0")) {//��֤�Ƿ�0��ͷ
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

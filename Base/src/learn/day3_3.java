package learn;
/**
 * System   ��
 * 
 * 
 * */

public class day3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 100; i++) {
//			new Demo();
//			System.gc();    //��������������
//		}
		
//		System.exit(0);   //�˳�java����� 0 �����˳� 1�쳣�˳�
		
//		long start = System.currentTimeMillis();   // ��ȡ1970��1��һ����ҹ����ǰʱ��ĺ�����
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("00");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(start-end);
		
		int[] arr = {11,22,33,66,};
		int[] is= new int[8];
		System.arraycopy(arr, 0, is, 0, arr.length);  //������������ 
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
	}

}

class Demo {
	@Override
	protected void finalize() throws Throwable {		//����������,���෽��
		// TODO Auto-generated method stub
		System.out.println("��������ɨ��");
	}
}
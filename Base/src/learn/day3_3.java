package learn;
/**
 * System   类
 * 
 * 
 * */

public class day3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 100; i++) {
//			new Demo();
//			System.gc();    //运行垃圾回收器
//		}
		
//		System.exit(0);   //退出java虚拟机 0 正常退出 1异常退出
		
//		long start = System.currentTimeMillis();   // 获取1970年1月一日午夜到当前时间的毫秒数
//		for (int i = 0; i < 1000; i++) {
//			System.out.println("00");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(start-end);
		
		int[] arr = {11,22,33,66,};
		int[] is= new int[8];
		System.arraycopy(arr, 0, is, 0, arr.length);  //拷贝数组内容 
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
	}

}

class Demo {
	@Override
	protected void finalize() throws Throwable {		//垃圾回收器,父类方法
		// TODO Auto-generated method stub
		System.out.println("垃圾被清扫了");
	}
}
package lt3;

import java.util.Scanner;

public class Lt3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("请输入一个整数：");
		int n = in.nextInt(); 
		
		System.out.println("你输入的是：" + n);
		System.out.println("这个数大于5：" + (n > 5));
		System.out.println("这个数小于100：" + (n < 100));
		System.out.println("这个数是偶数：" + (n % 2 == 0));
		// TODO 作业3
        // 判断输入的数是否能被3整除
	}
}

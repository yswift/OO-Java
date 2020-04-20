package lt7;

import java.util.Random;

public class Lt7_6 {
	public static void main(String[] args) {
		// 生成10个0-100的随机数，保存到数组中，求这10个数的和，并输出
		
		
		// 定义随机数对象
		Random r = new Random();
		// 定义10个元素的数组
		int[] num = new int[10];
		// 生成10个0-100的随机数
		for (int i=0; i<num.length; i++) {
			// 0-100的随机数,赋值给数组
			num[i] = r.nextInt(100);
		}
		// 显示这10个随机数
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.println();
		// 求数组元素的和
		int sum = 0;
		for (int i=0; i<num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum = " + sum);
	}
}

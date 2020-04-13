package lt6;

import java.util.Scanner;

public class Lt6_1 {
	// 求两个数中的最大值的方法
	// 为了调用方便把方式设为静态的（static关键字），后面的课程有静态方法的解释，
	// 在这个章节中，我们些的所有方法都是静态（static）的
	// int a, int b 称为形参，用于接收值
	static int max(int a, int b) {
		int max;
		if (a >= b) {
			max = a;
		} else {
			max = b;
		}
		// 返回 max 给调用者
		return max;
	}
	
	public static void main(String[] args) {
		// 定义对象in
		Scanner in = new Scanner(System.in);
		System.out.println("请输入两个整数，用空格分开: ");
		// 调用对象in的nextInt方法，从键盘输入整数
		int m = in.nextInt();
		int n = in.nextInt();
		// 调用max方法，求m,n的最大值，
		// 把实参m，n传递给 max的形参a,b
		// 把max的返回值，赋值给变量maxValue
		int maxValue = max(m, n);
		System.out.println("max = " + maxValue);
	}
}

package lt5;

import java.util.Scanner;

public class Lt_break2 {
	public static void main(String[] args) {
		// 输入一个正整数，判断这个数是否是素数
		// 素数只能被1和它本身整除的数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int n = input.nextInt();
		input.close();
		// 是否素数的标志，先默认是素数
		boolean isPrime = true;
		for (int i=2; i<n; i++) {
			// 如果n能被2-(n-1)中的某个数整除，n就不是素数
			if (n % i == 0) {
				isPrime = false;
				// 已经确定不是素数，后面的不需要判断了，可以结束循环
				break; 
			}
		}
		System.out.println(n + (isPrime ? "是素数" : "不是素数"));
	}

}

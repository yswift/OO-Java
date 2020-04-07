package lt4;

import java.util.Scanner;

public class Lt4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数: ");
		int n = input.nextInt();
		String result = "是奇数"; // 给result赋初值
		if (n % 2 == 0) {
			result = "是偶数"; // 当满足某个条件时，修改result的值
		}
		System.out.println(n + result);
		input.close();
	}
}

package lt4;

import java.util.Scanner;

public class Lt4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数: ");
		int n = input.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + "是偶数");
		} else {
			System.out.println(n + "是奇数");
		}
		input.close();
	}

}

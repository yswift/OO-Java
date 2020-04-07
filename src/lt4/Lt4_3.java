package lt4;

import java.util.Scanner;

public class Lt4_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份: ");
		int year = input.nextInt();
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
		input.close();
	}

}

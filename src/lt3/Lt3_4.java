package lt3;

import java.util.Scanner;

public class Lt3_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("请输入年：");
		int year = in.nextInt();

		boolean isLeapYear = (year % 4 == 0);
		// TODO 作业4
		// 上面的代码有bug，1900不是闰年，但结果是闰年，
		// 请修改代码，让计算结果正确
		System.out.println("是闰年：" + isLeapYear);
	}
}
//注意区分:
//数字0，字母O
//数字1，小写的l(L)，大写的I(i)


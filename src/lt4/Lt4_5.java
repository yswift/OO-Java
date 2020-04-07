package lt4;

import java.util.Scanner;

public class Lt4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份: ");
		int month = input.nextInt();
		
		int days;
		switch (month) {
		case 2:
			days = 28; break; // 注意，这里要有break,结束switch
		case 4: // 这里没有break，已满足条件，后续的条件不再判断，直到break结束switch
		case 6:
		case 9:
		case 11:
			days = 30; break;
		default:
			days = 31;	
		}
		System.out.println(month + "月份有" + days + "天");
		input.close();
	}

}

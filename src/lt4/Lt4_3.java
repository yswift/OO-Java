package lt4;

import java.util.Scanner;

public class Lt4_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���������: ");
		int year = input.nextInt();
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}
		input.close();
	}

}

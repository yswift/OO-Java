package lt4;

import java.util.Scanner;

public class Lt4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������: ");
		int n = input.nextInt();
		
		if (n % 2 == 0) {
			System.out.println(n + "��ż��");
		} else {
			System.out.println(n + "������");
		}
		input.close();
	}

}

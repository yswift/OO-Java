package lt4;

import java.util.Scanner;

public class Lt4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������: ");
		int n = input.nextInt();
		String result = "������"; // ��result����ֵ
		if (n % 2 == 0) {
			result = "��ż��"; // ������ĳ������ʱ���޸�result��ֵ
		}
		System.out.println(n + result);
		input.close();
	}
}

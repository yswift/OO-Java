package lt4;

import java.util.Scanner;

public class Lt4_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������·�: ");
		int month = input.nextInt();
		
		int days;
		if (month == 2) {
			days = 28; // ��ʱ�������Ƿ�����
		} else if (month==4 || month==6 || month==9 || month==11) {
			days = 30;
		} else {
			days = 31;
		}
		System.out.println(month + "�·���" + days + "��");
		input.close();
	}

}

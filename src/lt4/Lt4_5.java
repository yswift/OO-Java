package lt4;

import java.util.Scanner;

public class Lt4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������·�: ");
		int month = input.nextInt();
		
		int days;
		switch (month) {
		case 2:
			days = 28; break; // ע�⣬����Ҫ��break,����switch
		case 4: // ����û��break�����������������������������жϣ�ֱ��break����switch
		case 6:
		case 9:
		case 11:
			days = 30; break;
		default:
			days = 31;	
		}
		System.out.println(month + "�·���" + days + "��");
		input.close();
	}

}

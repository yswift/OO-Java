package lt3;

import java.util.Scanner;

public class Lt3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("������һ��������");
		int n = in.nextInt(); 
		
		System.out.println("��������ǣ�" + n);
		System.out.println("���������5��" + (n > 5));
		System.out.println("�����С��100��" + (n < 100));
		System.out.println("�������ż����" + (n % 2 == 0));
		// TODO ��ҵ3
        // �ж���������Ƿ��ܱ�3����
	}
}

package lt3;

import java.util.Scanner;

public class Lt3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���������������");
		String name = in.next(); 
		System.out.print("�����������䣺");
		int age = in.nextInt(); 
		System.out.print("����������ߣ�");
		double height = in.nextDouble();
		
		System.out.println("��ã�" + name);
		System.out.println("��������ǣ�" + age);
		System.out.println("�������ǣ�" + height);
		
		// TODO 
        // ��ҵ1: ������롢������صĴ���
		
		in.close();
	}
}

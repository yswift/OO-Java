package lt5;

import java.util.Scanner;

public class Lt_break2 {
	public static void main(String[] args) {
		// ����һ�����������ж�������Ƿ�������
		// ����ֻ�ܱ�1����������������
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = input.nextInt();
		input.close();
		// �Ƿ������ı�־����Ĭ��������
		boolean isPrime = true;
		for (int i=2; i<n; i++) {
			// ���n�ܱ�2-(n-1)�е�ĳ����������n�Ͳ�������
			if (n % i == 0) {
				isPrime = false;
				// �Ѿ�ȷ����������������Ĳ���Ҫ�ж��ˣ����Խ���ѭ��
				break; 
			}
		}
		System.out.println(n + (isPrime ? "������" : "��������"));
	}

}

package lt3;

import java.util.Scanner;

public class Lt3_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�������꣺");
		int year = in.nextInt();

		boolean isLeapYear = (year % 4 == 0);
		// TODO ��ҵ4
		// ����Ĵ�����bug��1900�������꣬����������꣬
		// ���޸Ĵ��룬�ü�������ȷ
		System.out.println("�����꣺" + isLeapYear);
	}
}
//ע������:
//����0����ĸO
//����1��Сд��l(L)����д��I(i)


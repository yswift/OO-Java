package lt5;
import java.util.Scanner;

// ����һ��������Ȼ��������ķ�ת��ʽ
// ���磺����1234, ���4321
public class Lt5_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ������: ");
		int n = input.nextInt();
		for (; n!=0; n/=10) {
			int v = n % 10;
			System.out.print(v);
		}
	}
}

package lt5;
import java.util.Scanner;

// 输入一个整数，然后输出它的翻转形式
// 例如：输入1234, 输出4321
public class Lt5_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数: ");
		int n = input.nextInt();
		for (; n!=0; n/=10) {
			int v = n % 10;
			System.out.print(v);
		}
		System.out.println();
		input.close();
	}
}

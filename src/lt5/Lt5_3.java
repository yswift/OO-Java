package lt5;

public class Lt5_3 {
	public static void main(String[] args) {
		// 计算1+2+...+10的和
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i<=10);
		System.out.println("sum = " + sum);
	}
}

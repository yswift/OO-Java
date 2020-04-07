package lt5;

public class Lt5_2 {
	public static void main(String[] args) {
		// 计算1+2+...+10的和
		int i = 1;
		int sum = 0;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
	}
}

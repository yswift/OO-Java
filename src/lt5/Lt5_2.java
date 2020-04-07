package lt5;

public class Lt5_2 {
	public static void main(String[] args) {
		// ¼ÆËã1+2+...+10µÄºÍ
		int i = 1;
		int sum = 0;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);
	}
}

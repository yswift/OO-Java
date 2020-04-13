package lt6;

public class Lt6_2 {
	// 下面的方法，想要交换两个变量的值，但不成功
	static void swap(int a, int b) {
		System.out.println("swap中，交换前");
		System.out.println("a=" + a + ", b=" + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("swap中，交换后");
		System.out.println("a=" + a + ", b=" + b);
	}

	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		System.out.println("main中，交换前");
		System.out.println("m=" + m + ", n=" + n);
		
		swap(m, n);
		
		System.out.println("main中，交换后");
		System.out.println("m=" + m + ", n=" + n);
	}
}

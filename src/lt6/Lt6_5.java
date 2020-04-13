package lt6;

public class Lt6_5 {
	// 判断参数n是否是素数
	// 是返回true，不是返回false
	static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i=2; i<n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static void test(String msg, boolean expect, boolean actual) {
		if (expect == actual ) {
			System.out.println("结果正确：" + msg);
		} else {
			System.out.println("结果错误：" + msg);
		}
	}
	
	public static void main(String[] args) {
		test("20不是素数", false, isPrime(20));
		test("101是素数", true, isPrime(101));
		
		// 编写代码，验证哥德巴赫猜想：任意大于6的偶数，都可以分解成两个素数的和
		// 验证 6-100之间的偶数
		// 在下面编写你的代码
	}
}

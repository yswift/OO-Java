package lt6;

public class Lt6_3 {
	// 比较这两个方法，体会不同的写法
	static boolean isEven1(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isEven2(int n) {
		return n % 2 == 0;
	}
	
	public static void main(String[] args) {
		// 注意，这里把方法调用结果作为 println的参数
		System.out.println("31是偶数？" + isEven1(31));
		System.out.println("54是偶数？" + isEven2(54));
	}
}

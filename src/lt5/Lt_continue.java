package lt5;

public class Lt_continue {
	public static void main(String[] args) {
		// 用两种方法输出1-10中3的倍数
		System.out.println("方法1");
		for (int i=1; i<=10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("方法2，使用continue");
		for (int i=1; i<=10; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

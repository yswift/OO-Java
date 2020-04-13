package lt6;

public class Lt6_4 {
	// 补充完整这个方法，判断输入的年是否是闰年，
	// 如果是闰年返回true，不是闰年返回false
	static boolean isLeapYear(int year) {
		return false;
	}
	
	static void test(String msg, boolean expect, boolean actual) {
		if (expect == actual ) {
			System.out.println("结果正确：" + msg);
		} else {
			System.out.println("结果错误：" + msg);
		}
	}
	
	public static void main(String[] args) {
		test("1900不是闰年", false, isLeapYear(1900));
		test("2019不是闰年", false, isLeapYear(2019));
		test("2000是闰年", true, isLeapYear(2000));
		test("2020是闰年", true, isLeapYear(2020));
	}
}

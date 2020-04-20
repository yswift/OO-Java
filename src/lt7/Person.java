package lt7;

public class Person {
	String name;
	int age;
	double height;

	// 没有static
	public void tell() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}

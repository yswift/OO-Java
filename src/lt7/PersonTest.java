package lt7;

public class PersonTest {
	public static void main(String[] args) {
		// 创建对象，赋值给变量p1
		Person p1 = new Person();
		// 向p1中的示例变量赋值
		p1.name = "张三";
		p1.age = 20;
		// 调用p1的方法
		p1.tell();

		// 创建对象，赋值给变量p1
		Person p2 = new Person();
		// 向p2中的示例变量赋值
		p2.name = "李四";
		p2.age = 22;
		// 调用p2的方法
		p2.tell();
	}
}

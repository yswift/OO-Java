package lt8;

public class PersonTest {
	public static void main(String[] args) {
		// 创建对象，赋值给变量p1
		Person p1 = new Person();
		// 向p1中的实例变量赋值
		// 用setter给变量赋值，即用p1.setName("张三"),代替p1.name = "张三";
		p1.setName("张三");
		p1.setAge(20);
		// 调用p1的方法
		p1.tell();

		// 创建对象，赋值给变量p2
		Person p2 = new Person();
		// 向p2中的实例变量赋值
		p2.setName("李四");
		p2.setAge(22);
		// 调用p2的方法
		p2.tell();
	}
}

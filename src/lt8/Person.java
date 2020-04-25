package lt8;

public class Person {
	// 封装，实例变量声明为私有的(加上private)
	private String name;
	private int age;
	private double height;
	
	// 为实例变量提供getter和setter，
	// 现阶段，我们不检查参数的合法性
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 1. 命名规则: 实例变量age, 方法命名为：getAge
    // 2. 有返回值：返回类型为int, 因为实例变量age的类型为int
    // 3. 无参数
	public int getAge() {
		return age;
	}

	// 1. 命名规则: 实例变量age, 方法命名为：setAge
    // 2. 无返回值
    // 3. 有参数：参数类型为int, 因为实例变量age的类型为int
	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// 没有static
	public void tell() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}

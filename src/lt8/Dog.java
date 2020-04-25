package lt8;

public class Dog {
	// 定义实例变量，代表对象的属性
	int size;
	String name;

	// 定义方法，代表对象的行为
	public void bark() {
		// 对象的方法都相同，但受到实例变量的影响
		// 即受size的影响，叫声不同
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 14) {
			System.out.println("Ruff!  Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}

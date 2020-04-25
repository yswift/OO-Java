package lt8;

public class GoodDog {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		// 判断参数是否合法
		if (s > 1 && s < 100) {
			// 合法，给实例变量赋值
			size = s;
		} else {
			// 不合法，抛出异常（异常在后面介绍）
			throw new IllegalArgumentException("错误的size参数:" + s);
		}
	}

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

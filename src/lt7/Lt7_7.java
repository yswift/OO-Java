package lt7;

import java.util.Random;

public class Lt7_7 {
	// 生成10个Person对象，用随机数给年龄赋值，保存到数组中，求平均年龄，并输出
	public static void main(String[] args) {
		// 定义随机数对象
		Random r = new Random();
		// 定义Person对象数组
		Person[] persons = new Person[10];
		// 生成10个Person对象，用随机数给年龄赋值
		for (int i=0; i<persons.length; i++) {
			// 注意，必须创建对象并放入数组
			persons[i] = new Person();
			// 年龄范围20-40
			persons[i].age = 20 + r.nextInt(20);
		}
		// 输出年龄
		for (int i=0; i<persons.length; i++) {
			Person p = persons[i];
			System.out.print(p.age + ", ");
		}
		System.out.println();
		// 求年龄合计
		int sum = 0;
		// 注意新的for循环格式，与输出年龄的for循环对比，理解新的格式
		for (Person p : persons) {
			sum += p.age;
		}
		double avg = sum * 1.0 / persons.length;
		System.out.println("平均年龄: " + avg);
	}
}

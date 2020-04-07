package lt3;

import java.util.Scanner;

public class Lt3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("请输入你的姓名：");
		String name = in.next(); 
		System.out.print("请输入你年龄：");
		int age = in.nextInt(); 
		System.out.print("请输入你身高：");
		double height = in.nextDouble();
		
		System.out.println("你好，" + name);
		System.out.println("你的年龄是：" + age);
		System.out.println("你的身高是：" + height);
		
		// TODO 
        // 作业1: 添加输入、输出体重的代码
		
		in.close();
	}
}

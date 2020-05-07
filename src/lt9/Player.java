package lt9;

// 玩家类
public class Player {
	// 记录玩家猜测的数
	int number = 0;
	
	// 玩家猜数的方法，猜测一个数，保存到实例变量number中
	public void guess() {
		// 生成0-9之间的随机数，来模拟猜数
		// Math.random() 生成[0,1)之间的随机数，乘以10得到[0,10)之间的数
		number = (int)(Math.random()*10);
		System.out.println("玩家猜:" + number);
	}
}

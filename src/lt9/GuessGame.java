package lt9;

// 游戏类
public class GuessGame {
	// 定义玩家对象
	Player p1;

	// 启动游戏的方法
	public void startGame() {
		// 建立玩家对象
		Player p1 = new Player();

		// 生成一个随机数[0,10)（玩家猜测的目标）
		// Math.random() 生成[0,1)之间的随机数，乘以10得到[0,10)之间的数
		int targetNumber = (int) (Math.random() * 10);
		
		// 使用循环，猜测正确才退出循环
		while (true) {
			System.out.println("目标数是：" + targetNumber);
			
			// 玩家猜测
			p1.guess();
			
			// 检查玩家是否猜测正确
			if (p1.number == targetNumber) {
				System.out.println("猜测正确，你赢了!");
				break; // 退出循环
			} else {         
				System.out.println("猜测错误，继续尝试");
			}
		}
	}
}

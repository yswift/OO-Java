package lt12;

public abstract class Animal {
	String picture;// 代表该动物性食物JPEG的文件名
	String food; // 该动物食用的食物类型。 目前，只能有两个值：肉或草。
	int hunger; // 表示动物饥饿程度的整数。 它的变化取决于动物的进食时间（和进食量）。
	String boundaires; // 代表动物活动范围的高度和宽度的值（例如640 x 480）。
	String location; // X和Y坐标 关于动物在区域中的位置。
	
	public abstract void makeNoise();
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("animal sleep");
	}
	
	public abstract void roam();
}

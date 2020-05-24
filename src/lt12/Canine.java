package lt12;

//Canine类，实现了roam方法，但没有实现 eat，makeNoise，所以Canine也是抽象的
// 试试去掉abstract, 是否能通过编译，错误信息是什么？
public abstract class Canine extends Animal {
	public void roam() {
		System.out.println("canine roam");
	}
}

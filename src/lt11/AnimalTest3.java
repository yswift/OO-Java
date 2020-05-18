package lt11;

import lt10.Animal;
import lt10.Wolf;

public class AnimalTest3 {
	public static void main(String[] args) {
		Animal a = new Wolf();
		System.out.println("a = new Wolf()");
		a.makeNoise();
		a.roam();
		a.eat();
		a.sleep();
		
		System.out.println("\na = new Dog()");
		a = new Dog();
		a.makeNoise();
		a.roam();
		a.eat();
		a.sleep();
	}
}

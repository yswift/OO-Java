package lt11;

import lt10.Animal;
import lt10.Wolf;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal w = new Wolf();
		
		w.makeNoise();
		w.roam();
		w.eat();
		w.sleep();
	}
}

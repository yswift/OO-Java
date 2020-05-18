package lt11;

import lt10.Wolf;

class PetOwner {
	public void start() {
		Vet v = new Vet();
		Dog d = new Dog();
		Wolf w = new Wolf();
		v.giveShot(d);
		v.giveShot(w);
	}
}

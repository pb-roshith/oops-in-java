abstract class Animal {
	abstract void sound();

	void sleep() {
		System.out.println("i am sleeping");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("bark");
	}

	void leg() {
		System.out.println("4 legs");
	}
}

public class Abstraction
{
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.sleep();
		d.leg();
	}
}
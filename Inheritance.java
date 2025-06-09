class Vehicle {
	void start() {
		System.out.println("vehicle is starting");
	}

	void stop() {
		System.out.println("vehicle is stopped");
	}
}

class Car extends Vehicle {
	void start() {
		System.out.println("car is started");
	}

	void wheel() {
		System.out.println("4 wheels");
	}
}

public class Inheritance
{
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.wheel();
	}
}
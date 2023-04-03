package Inheritance;

class Vehicle {
void running() {
	System.out.println("Running ");
}
}
class car extends Vehicle{
	void run() {
		System.out.println("car running");
	}
}
class Tata extends car{
	void speed() {
		System.out.println("Speed is high");
	}
}

public class Multilevel_eg {
	public static void main(String[] args) {
		Tata t = new Tata();
		t.run();
		t.speed();
		t.running();
	}

}

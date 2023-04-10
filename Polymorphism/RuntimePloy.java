package Polymorphism;

public class RuntimePloy {
	public static void main(String[] args) {
		Java_student js; // Reference variable of parent class
		js = new Vinayak();
		System.out.println("Quality of Vinayak is: "+js.quality());
		js = new Tushar();
		System.out.println("Quality of Tushar is: "+js.quality());
	
	}	
}
class Java_student{
	String quality() {
		return null;
	}
}
class Tushar extends Java_student{
	String quality() {
		return "Active";
	}
}
class Vinayak extends Java_student{
	String quality() {
		return "Dumb";
	}
}
class Pooja extends Java_student{
	String quality() {
		return "regular";
	}
}
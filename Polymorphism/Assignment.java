package Polymorphism;
class Subjects{
	int Marks() {
		return 0;
	}
}
class Computer extends Subjects{
	int Marks() {
		return 95;
	}
}
class Maths extends Subjects{
	int Marks() {
		return 55;
	}
}
class English extends Subjects{
	int Marks()  {
		return 85;
	}
}
class Java extends Subjects{
	int Marks()  {
		return 75;
	}
}
class Python extends Subjects{
	int Marks()  {
		return 65;
	}
}
public class Assignment {
	public static void main(String[] args) {
		Subjects sub; // Reference variable of parent class
		sub = new Computer();
		System.out.println("Marks of Computer is: "+sub.Marks());
		sub = new English();
		System.out.println("Marks of English is: "+sub.Marks());
	
	}	
}

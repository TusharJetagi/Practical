package Inheritance;
class A {
void show() {
	System.out.println("Class A ");
}
}
class B extends A{
	void print() {
		System.out.println("Class B");
	}
}
class C extends B{
	void display() {
		System.out.println("Class C");
	}
}
public class Example {
	public static void main(String[] args) {
		C obj = new C();
		obj.show();
		obj.print();
		obj.display();
		
		
	}

}

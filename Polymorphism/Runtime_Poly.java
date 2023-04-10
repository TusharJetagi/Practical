package Polymorphism;
class A{
 void run() {
	 System.out.println("Parent class");
 }
}
class B extends A{
	void run() {
		System.out.println("Child class");
	}
}
public class Runtime_Poly {
	public static void main(String[] args) {
		A obj = new B(); //up casting - if the reference variable of parent class refers 
		obj.run();					//to the object of child class
	}

}

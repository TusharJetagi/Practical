package Inheritance;

public class Multilevel 
{
	public static void main(String[] args) 
	{
		SIChild2 child = new SIChild2();
		child.display();
		child.show();
		child.print();
	}

}
class SIParent1{
	void show() {
		System.out.println("Parent class");
	}
}
class SIChild1 extends SIParent1{
	void display() {
		System.out.println("Child class 1");
	}
}
class SIChild2 extends SIChild1{
	void print() {
		System.out.println("Child class 2");
	}
}
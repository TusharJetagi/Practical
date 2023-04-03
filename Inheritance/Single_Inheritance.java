package Inheritance;

public class Single_Inheritance 
{
	public static void main(String[] args) 
	{
		SIChild child = new SIChild();
		child.display();
		child.show();
		}
}
 class SIParent
 {
	 void show() 
	 {
		 System.out.println("Parent class");
	 }
	 
 }
 class SIChild extends SIParent
 {
	 void display() 
	 {
		 System.out.println("Child class");
	 }
 }

package Final;
// Final method -- we cannot override final method.
class FinalMethod1 
{
	final void display() 
	{	
		System.out.println("Final method");
	}
}
class child extends FinalMethod1
{
	// try to override parent class final method
	/* public final void display()
	{
		//System.out.println("overridden");
	}*/
}
public class FinalMethod
{
	public static void main(String[] args) 
	{
		child ob = new child();
		ob.display();
	}
}

	



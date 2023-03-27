package Constructor;

public class default_constructor 
{
	default_constructor()
	{ // default constructor 
		System.out.println("Default Constructor called");
	}
	public static void main(String[] args) 
	{
		// constructor called at the time of object creation with new() keyword.
		default_constructor obj =new default_constructor();
	}

}

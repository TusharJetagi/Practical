package Constructor;

public class default_constructor2 
{
	int a;
	String name;
	void result() 
	{
		System.out.println(a+""+name);
	}
	
	public static void main(String[] args) 
	{
		default_constructor2 obj = new default_constructor2();
		System.out.println(obj.a+"\n"+obj.name);
	}
}


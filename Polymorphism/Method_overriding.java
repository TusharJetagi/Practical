package Polymorphism;
class employee
{
	void  incrementSalary()
	{
		System.out.println("The salary of developer will be incresed by 5%");
	}
}

class developer extends employee
{
	void incrementSalary()
	{
		System.out.println("The salary of developer will be incresed by 7%");
	}
}

class manager extends employee
{
	void incrementSalary()
	{
		System.out.println("The salary of manager will be incresed by 10%");
	}
}


public class Method_overriding 
{
	public static void main(String[] args) 
	{
	
		manager m=new manager();
		m.incrementSalary();

	}

}

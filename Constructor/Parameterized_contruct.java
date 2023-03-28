package Constructor;

public class Parameterized_contruct 
{
	int age;
	String name;
	
	Parameterized_contruct(int a, String n)
	{
		age = a;
		name = n;
	}
	void show() 
	{
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) 
	{
		Parameterized_contruct obj=new Parameterized_contruct(20, "Tushar");
		Parameterized_contruct obj1=new Parameterized_contruct(45, "Vinayak");
		Parameterized_contruct obj2=new Parameterized_contruct(18, "Virat");
		obj.show();
		obj1.show();
		obj2.show();
		
	}
	

}

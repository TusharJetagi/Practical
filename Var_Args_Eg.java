class Calculator 
{
	int addition(int...n) 
	{
		int sum = 0;
		for(int i:n) 
		{
			sum +=i;
		}
		return sum;
	}
	int substraction(int...n) 
	{
		int result = 0;
		for(int i:n) 
		{
			result -=i;
		}
		return result;
	}
	int Multiplication(int...n) 
	{
		int result = 1;
		for(int i:n) 
		{
			result *=i;
		}
		return result;
	}

}
public class Var_Args_Eg
{
	public static void main(String[] args) 
	{
	Calculator c = new Calculator();
	System.out.println("The addition of 4,5,6 is: "+c.addition(4,5,6));
	System.out.println("The substraction of 6,7,8,9 is: "+c.substraction(6,7,8,9));
	System.out.println("The multiplication of 1,2,3 is: "+c.Multiplication(1,2,3));

}
}

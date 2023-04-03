package Inheritance;

class Parents_Is_a_Inheritance 
{
	int marks = 95;
}

class Is_a_Inheritance extends Parents_Is_a_Inheritance
{
	int Additional_Percentage = 2;
	public static void main(String[] args) 
	{
		Is_a_Inheritance obj = new Is_a_Inheritance();
		System.out.println("Total Marks: "+(obj.marks+obj.Additional_Percentage));
	}
}


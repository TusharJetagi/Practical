package Array;

public class Array_eg4 
{
	// creating a method which pass an array as a parameter
	static void maximumNo(int array[]) 
	{
		int max = array[0];
		for(int i=1;i<array.length;i++)
			if(max<array[i])
				max = array[i];
		System.out.println(max);
	}
	
	static void minimumNo(int array[]) 
	{
		int min = array[0];
		for(int i=1;i<array.length;i++)
			if(min>array[i])
				min = array[i];
		System.out.println(min);

	}
	
	public static void main(String[] args) 
	{
		// declaring & initializing array
		int a[]= {5,7,9,2,10};
		maximumNo(a); // passing array to a method max
		minimumNo(a); // // passing array to a method min
 	}
}

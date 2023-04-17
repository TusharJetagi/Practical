package Array;

public class Array_eg {
	public static void main(String[] args) 
	{
		int a[]= new int[5]; //declaration and instantiation
		// initialization
		a[0] = 2;
		a[1] = 9;
		a[2] = 5;
		a[3] = 7;
		a[4] = 1;
		
		// traversing an array using for each loop
		System.out.println("Traversing an array by using for each loop");
		for(int i:a)
			System.out.println(i);
		System.out.println("Traversing an array by using for loop");
		for(int i=0; i<a.length;i++)
			System.out.println(a[i]);
	}
}

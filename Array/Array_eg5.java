package Array;

import java.util.Scanner;

public class Array_eg5 
{
	int n;
	int []s = new int[n];
	public static void main(String[] args) 
	{
		Array_eg5 obj = new Array_eg5();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		obj.n = n;
		obj.s = new int[obj.n];
		
		int sum=0,avg=0,multi=1;
		
		for(int i=0;i<obj.n;i++) 
		{
			obj.s[i] = sc.nextInt();
			sum = sum+obj.s[i];
			multi = multi*obj.s[i];
		}
		
		avg = sum/n;
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(multi);
	}

}

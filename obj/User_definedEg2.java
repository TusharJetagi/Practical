package obj;
import java.util.*;
public class User_definedEg2 {
	
	public static void sum_average(int no1,int no2,int no3) 
	{
		int sum = no1+no2+no3;
		float average = sum/3f;
		System.out.println("sum is: "+sum);
		System.out.println("average is: "+average);
		}
	
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number: ");
	int no1 =sc.nextInt();
	
	System.out.println("Enter 2nd number: ");
	int no2 =sc.nextInt();
	
	System.out.println("Enter 3rd number: ");
	int no3 =sc.nextInt();
	
	sum_average(no1,no2,no3);
	
}
}

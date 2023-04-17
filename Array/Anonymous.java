package Array;
// no need to declare the array inside method
public class Anonymous 
{
	static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		print(new int[] {10,20,30,40,50,60,70,80}); //passing Anonymous array to method
	}

}

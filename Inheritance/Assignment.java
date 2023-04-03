package Inheritance;
class Arithmetic{
	int result;
	void add(int num_1,int num_2) 
	{
		result = num_1+num_2;
	}
}
class adder extends Arithmetic{
	void show() {
		System.out.println("Result is: "+result);
	}
}
public class Assignment {
	public static void main(String[] args) {
		adder a = new adder();
		a.add(10, 20);
		a.show();
	}

}

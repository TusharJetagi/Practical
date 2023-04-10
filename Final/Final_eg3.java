package Final;

final class Final_eg3 
{
	void show() 
	{
		System.out.println("Final class method");
	}
	// cannot extend final class
	/* class Test Final_eg3
	 * {
	 * System.out.println("child class override method")
	 * }
	 */
	public static void main(String[] args) 
	{
		Final_eg3 fe3 = new Final_eg3();
		fe3.show();
		
	}

}

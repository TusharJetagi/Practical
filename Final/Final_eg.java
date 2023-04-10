package Final;
// Final keyword - Provide restrictions
// Final variable - cannot change the value of variable
public class Final_eg 
{
final int value = 18;
void display() 
{	//value = 45;
	System.out.println(value);
}
public static void main(String[] args) 
{
	Final_eg ob = new Final_eg();
	ob.display();
}
}

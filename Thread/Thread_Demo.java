package Thread;

public class Thread_Demo extends Thread
{
	public Thread_Demo(String name)
	{
		super(name);
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) 
	{
		Thread_Demo t1 = new Thread_Demo("First Thread");
		Thread_Demo t2 = new Thread_Demo("Second Thread");
		Thread_Demo t3 = new Thread_Demo("Third Thread");
		
		t1.start();
		t2.start();
		t3.start();
	}

}

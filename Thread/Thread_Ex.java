package Thread;

public class Thread_Ex extends Thread
{
	
	public void run()
	{
	System.out.println(Thread.currentThread().getName());
	}	

	public static void main(String[] args) 
	{
	Thread_Ex t1 = new Thread_Ex();
	Thread_Ex t2 = new Thread_Ex();
	Thread_Ex t3 = new Thread_Ex();
	Thread_Ex t4 = new Thread_Ex();
	
	t1.start();
	try
	{
		t1.join();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		
	}
	t2.start();
	t3.start();
	t4.start();
}
}

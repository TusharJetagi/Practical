package Thread;

public class Thread_Ex2 extends Thread
{
	public void run()
	{
	for(int i=1; i<=5; i++)
	{
		try
		{
			// sleep method is used to hold the thread for sometime
			Thread.sleep(500); //milliseconds
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(i+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	}	

	public static void main(String[] args) 
	{
	Thread_Ex t1 = new Thread_Ex();
	Thread_Ex t2 = new Thread_Ex();
	Thread_Ex t3 = new Thread_Ex();
	Thread_Ex t4 = new Thread_Ex();
	
	//t1.start();
	//try
	//{
	//	t1.join();
	//}
	//catch(Exception e)
	//{
	//	System.out.println(e.getMessage());
		
	//}
	//t2.start();
	//t3.start();
	//t4.start();
	
	t1.setName("Thread-1");
	t2.setName("Thread-2");
	t3.setName("Thread-3");
	t4.setName("Thread-4");
	
	//Priority can only be set between 1 to 10
	t1.setPriority(MAX_PRIORITY);
	t2.setPriority(MIN_PRIORITY);
	t3.setPriority(NORM_PRIORITY);
	t4.setPriority(7);
	
	t1.start();
	t2.start();
	t3.start();
	t4.start();
		
}
}



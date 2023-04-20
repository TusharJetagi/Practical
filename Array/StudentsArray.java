package Array;

public class StudentsArray // main class
{
	// declaring instance variable
	int stud_no;
	String Name, Mail, Address;
	double fees;
	// static member for increasedFees method
	static double incrasedFees;
	
	/*creating constructor for assessing details to 
	  student passing values through overload constructor */
	
	StudentsArray(int sn, String name, String mail, String address)
	{
		this.stud_no = sn;
		this.Name = name;
		this.Mail = mail;
		this.Address = address;
	}
	// method for initializing fees to student
	void fees(double f) {
		fees = f; // assigning passing value
	}
	// method for printing output
	//for concatenation and sop the output
	void display() 
	{
		// updating fees before printing
		this.fees = this.fees+incrasedFees;
		System.out.println("Id - "+this.stud_no+"    "+"Name - "+this.Name+"      "+"Mail - "+this.Mail+"    "+"Address - "+this.Address+"   "+"Fees - "+fees);
		
	}
	// increasing fees method
	static void incraseFees(int n, double f) 
	{
		if(f<2000) 
		{
			f = 10*f/100;  // logic for increasing fees
			incrasedFees = f; // assigning the value to static instance
		}
	}
	// main method
	public static void main(String[] args) 
	{
		// instantiating student type of array and declaring size
		StudentsArray[] student = new StudentsArray[5];
		
		//instantiating objects of StudentClass and initializing into array
		student[0] = new StudentsArray(101, "Kiran", "kiran@gmail.com","Solapur");
		student[1] = new StudentsArray(102, "Rohit", "rohit@gmail.com", "Solapur");
		student[2] = new StudentsArray(103, "Rahul", "rahul@gmail.com", "Solapur");
		student[3] = new StudentsArray(104, "Venky", "venky@gmail.com", "Solapur");
		student[4] = new StudentsArray(105, "Virat", "virat@gmail.com", "Solapur");
		
		// adding fees values
		student[0].fees(1064);
		student[1].fees(2056);
		student[2].fees(957);
		student[3].fees(1999);
		student[4].fees(2001);
		
		//increasing fees whose fees is less than 2000
		incraseFees(100,1064);
		incraseFees(102,957);
		incraseFees(103,1999);
		
		//traversing the array of student objects
		System.out.println("\n		______________Details of Student____________\n");
		for(StudentsArray i:student) 
		{
			i.display();//traversing with invocation of display
			
		}
	}
}

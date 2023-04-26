package Array;
import java.util.*;

public class BookServices 
{
	static Book book[]= new Book[10]; // book array
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	// create book method
	public static void  createBook() 
	{
		System.out.println("Enter Book Id: ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Book Name:");
		String bname = sc.nextLine();
		
		System.out.println("Enter Book Price:");
		double price =sc.nextDouble();	
	
		book[index] = new Book(id,bname,price);
		index++;
		System.out.println("Book detail created Successfully!!");
	
	}
	// display all book details method
	public static void getAllBookDetails() 
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Book Id: "+book[i].getBookId());
			System.out.println("Book Name: "+book[i].getBookName());
			System.out.println("Book Price "+book[i].getBookPrice());
			System.out.println("=====================================");
		}
	}
	
	//display book details using book Id
	public static void getBookDetailsUsingId() 
	{
		boolean flag=false;
		System.out.println("Enter book id to search");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==book[i].getBookId())
			{
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book Price:"+book[i].getBookPrice());
				System.out.println("=======================================");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Book Details not found");
		}
	}

	//display book details using book name
	public static void getBookDetailsUsingName() 
	{
		boolean flag=false;
		sc.nextLine();
		System.out.println("Enter book name to search");
		String bookName=sc.nextLine();
		for(int i=0;i<index;i++)
		{
			if(bookName.equalsIgnoreCase(book[i].getBookName()))
			{
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book Price:"+book[i].getBookPrice());
				System.out.println("=======================================");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Book Details not found");
		}
	}
	public static void updateBookDetailsUsingId()
	{
		boolean flag=false;
		System.out.println("Enter book Id to update");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==book[i].getBookId())
			{
				sc.nextLine();
				System.out.println("Enter new Book name:");
				String bname=sc.nextLine();
				System.out.println("Enter new Book price:");
				double price=sc.nextDouble();
				book[i].setBookName(bname);
				book[i].setBookPrice(price);
				System.out.println("Book details updated successfully");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Book Details not updated");
		}
	}


		
	} 



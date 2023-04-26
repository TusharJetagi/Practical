package Array;
import java.util.*;
public class BookMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		BookServices bService = new BookServices();
		
		
		System.out.println("Welcome To Congress Library");
		System.out.println("=================================");
		
		do 
		{
			
		System.out.println("Choose the options:");
		System.out.println("1) Create Book Details \n"
				+ "2) Display all book deails\n"
				+ "3) Display book details using id\n"
				+ "4) Display book details using name\n"
				+ "5) Update book details using id\n"
				+ "6) Exit");
		
		System.out.println("==================================");
		System.out.println("Enter the Choice: ");
		
		choice=sc.nextInt();
		switch(choice) 
		{
		case 1:
			bService.createBook();
			break;
		case 2:
			bService.getAllBookDetails();
			break;
			
		case 3:
			bService.getBookDetailsUsingId();
			System.out.println();
			break;
			
		case 4:
			bService.getBookDetailsUsingName();
			System.out.println();
			break;
			
		case 5:
			bService.updateBookDetailsUsingId();
			break;

			
		case 6:
			System.out.println("Thank you for visiting!!");
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Choice !!");
		
}
		

		}while(true);


	}

}

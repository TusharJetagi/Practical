package Inheritance;

public class Book 
{
	String Bookname;
	int Bookprice;
	Author authorDetails;
	Publisher publisherDetails;
	Book(String Bookname,int Bookprice,Author authorDetails,Publisher publisherDetails)
	{
		this.Bookname=Bookname;
		this.Bookprice=Bookprice;
		this.authorDetails=authorDetails;
		this.publisherDetails=publisherDetails;
		
	}
	void display() 
	{
		System.out.println("Book Name: "+Bookname+"\nBook price: "+Bookprice);
	}
	
	void showAuthor() 
	{
		System.out.println("-----------------Author Details-----------------");
		System.out.println("Author Name: "+authorDetails.AuthorName);
		System.out.println("Author Age: "+authorDetails.AuthorAge);
		System.out.println("Author Place: "+authorDetails.AuthorPlace);
	}
	
	void showPublisher() 
	{
		System.out.println("-----------------Publisher Details-----------------");
		System.out.println("Publisher Name: "+publisherDetails.PublisherName);
		System.out.println("Publisher ID: "+publisherDetails.Publisherid);
		System.out.println("Publisher City: "+publisherDetails.Publishercity);
		
	}
	
	public static void main(String[] args) 
	{
		Author a = new Author("Micheal",32,"USA");
		Publisher p = new Publisher("Sun Publisher","ABC-1110","London");
		Book b = new Book("Core Java",800,a,p);
		b.display();
		b.showAuthor();
		b.showPublisher();
	}
	
}

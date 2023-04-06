package Polymorphism;
class sports{
	String getName() {
		return "Generic sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in "+ getName());
	}
}
class Football extends sports
{
	@Override
	String getName() 
	{
		return "Football class";
	}
	@Override
	void getNumberOfTeamMembers() 
	{
		System.out.println("Each team has 11 players in "+ getName());
		
	}
}

public class Method_overriding_eg2 {
	public static void main(String[] args) {
		sports c1 = new sports();
		Football c2  = new Football();
		System.out.println(c1.getName());
		c1.getNumberOfTeamMembers();
		System.out.println(c2.getName());
		c2.getNumberOfTeamMembers();
	}
	

}

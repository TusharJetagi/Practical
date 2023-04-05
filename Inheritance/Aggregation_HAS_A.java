package Inheritance;

public class Aggregation_HAS_A {
	public static void main(String[] args) {
		Address a = new Address("Solapur","North Solapur","India");
		Student s = new Student(1,"Tushar",a);
		s.show();
		
		
	}

}

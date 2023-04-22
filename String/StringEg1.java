package String;

public class StringEg1 {
	public void show() {	// method 1
		char[] arr = {'j','a','v','a'}; //char type array
		System.out.println(arr);
		String s =new String(arr); // by using new keyword creating string
		System.out.println("Value is:"+s); //java
		
	}
	public void myFunction() {	// method 2
		String s1 = "Tushar"; // String literal(creating object of string
		String s2 = "Tushar"; // it does not create any new object
		String s3 = new String(s1);
		System.out.println(s3); // Tushar
	}
	public static void main(String[] args) {
		StringEg1 str = new StringEg1();
		str.show();
		str.myFunction();
	}
	

}

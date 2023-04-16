
public class VaraagrsEg 
{
	static void show(String...text) {
		System.out.println("Show method invoked ");
		for(String s:text) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		show();
		show("hi");
		show("I","love","coding");
		show("a","b","c","d");
	}

}

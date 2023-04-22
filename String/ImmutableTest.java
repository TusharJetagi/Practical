package String;

public class ImmutableTest {
	public static void main(String[] args) {
		String str = "Tushar";
		str.concat("Jetagi"); //insert the string at the end
		str = str.concat("Jetagi");// it will print TusharJetagi
		// it will print Tushar only because string is immutable
		System.out.println(str);
	}

}

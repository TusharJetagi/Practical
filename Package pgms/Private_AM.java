package Access_Mod;

class Test{
	private int a=10;
	private void display() {
		System.out.println("Private method");
	}
}
public class Private_AM {
	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println(obj.a);
		obj.display();
	}

}

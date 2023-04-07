package Super;

class Shape{
	String name = "Circle";
}
class Size extends Shape{
	String name = "No Size";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperIV {
public static void main(String[] args) {
	Size obj = new Size();
}
}

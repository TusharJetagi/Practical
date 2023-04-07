package Super;

class Shape1{
	void print() {
		System.out.println("print circle");
	}
}
class Size1 extends Shape1{
	void print() {
		System.out.println("Print triangle");
		
	}
	void display() {
		System.out.println("print nothing");
	}
	void show() {
		super.print();
		display();
		print();
	}
}
class SuperMethod {
	public static void main(String[] args) {
		Size1 obj = new Size1();
		obj.show();
	}
	

}

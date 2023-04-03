package Inheritance;
class Os{
	void boost() {
		System.out.println("Boost on");
	}
}
class windows extends Os{
	void run() {
		System.out.println("run on");
	}
}
class Linux extends Os{
	void storage() {
		System.out.println("high storage");
	}
}
public class Heirarchical_Inheritance {
	public static void main(String[] args) {
		Linux l = new Linux();
		l.boost();
		l.storage();
		windows w = new windows();
		w.boost();
		w.run();
	}

}

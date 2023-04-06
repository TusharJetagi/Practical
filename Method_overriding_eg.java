package Polymorphism;
class Exam{
	int marks() {
		return 0;
	}
}
class comp extends Exam{
	int marks() {
		return 80;
	}
}
class science extends Exam{
	int marks() {
		return 50;
	}
}
class maths extends Exam{
	int marks() {
		return 70;
	}
}
class eng extends Exam{
	int marks() {
		return 90;
	}
}
public class Method_overriding_eg {
	public static void main(String[] args) {
		comp c =new comp();
		maths m = new maths();
		science s = new science();
		eng e = new eng();
		System.out.println("Computer marks is: "+c.marks());
		System.out.println("Math marks is: "+m.marks());
		s.marks();
		e.marks();
	}

}

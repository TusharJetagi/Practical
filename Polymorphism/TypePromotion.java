package Polymorphism;

public class TypePromotion {
	void add(int a, int b) {         // Method 1
		System.out.println(a+b);
	}
	void add(int a, int b,int c) {	// Method 2
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		TypePromotion obj = new TypePromotion();
		obj.add(10, 20); //2nd value will be promoted to double
		obj.add(2, 3, 4);
	}

}
// byte - int -short-long-float-double
//char-int-float-double-long
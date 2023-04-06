package Polymorphism;

public class MethodOverloading {
	static int sum(int a, int b) {
		return a + b;
	}
	static int sum(int x, int y, int z) {
		return x + y + z;
	}
	public static void main(String[] args) {
		System.out.println(MethodOverloading.sum(10, 20));
		System.out.println(MethodOverloading.sum(20, 30, 40));
	}

}

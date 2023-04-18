package Array;

public class CopyArray {
	public static void main(String[] args) {
		//declaring source array
		char[]copyFrom = {'d','e','c','f','f','e','i','n'};
		// declaring a Destination array
		char[]copyTo = new char[7]; // new array
		System.arraycopy(copyFrom, 0, copyTo, 0, 4);
		// print the destination array
		System.out.println(String.valueOf(copyTo));
	}

}

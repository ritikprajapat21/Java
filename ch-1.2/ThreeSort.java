/*
Write a program that takes three integer command-line arguments and prints them in ascending order. Use Math.min() and Math.max().
*/

public class ThreeSort {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int p = Math.min(a, Math.min(b, c));
		int q = Math.min(a, Math.max(b, c));
		int r = Math.max(a, Math.max(b, c));

		System.out.println("Ascending Order: " + p + ", " + q + ", " + r);
	}
}

/*
Write a program that prints five uniform random numbers between 0 and 1, their average value, and their minimum and maximum values. Use Math.random(), Math.min(), and Math.max().
*/
public class UniformRandomNumber {
	public static void main(String[] args) {
		double a = Math.random();
		double b = Math.random();
		double c = Math.random();
		double d = Math.random();
		double f = Math.random();

		double average = (a + b + c + d + f)/5.0;
		double min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, f))));
		double max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, f))));

		System.out.println("Average: " + average);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
}

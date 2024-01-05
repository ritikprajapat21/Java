/*
Write a program that takes three double command-line arguments x, y, and z and prints true if the values are strictly ascending or descending ( x < y < z or x > y > z ), and false otherwise.
*/
public class OrderCheck {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);

		System.out.println((x < y && y < z) || (x > y && y > z));
	}
}

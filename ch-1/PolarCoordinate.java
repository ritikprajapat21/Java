/*
Write a program that converts from Cartesian
to polar coordinates. Your program should accept two double command-line arguments x and y and print the polar coordinates r and angle. Use the method Math.atan2(y, x) to compute the arctangent value of y/x that is in the range from -pi to pi.
*/

public class PolarCoordinate {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		double r = Math.sqrt( x*x + y*y );

		double angle = Math.atan2(y, x);

		System.out.println("(" + r + ", " + angle + ")");
	}
}

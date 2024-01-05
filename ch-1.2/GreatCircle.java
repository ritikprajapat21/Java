/*
   Write a program GreatCircle that takes four double command-line arguments—x1, y1, x2, and y2—(the latitude and longitude, in de-
   grees, of two points on the earth) and prints the great-circle distance between them. The great-circle distance (in nautical miles) is given by the following equation:

   d = 60*arccos(sin(x1)*sin(x2) + cos(x1)*cos(x2)*cos(y1  y2))

   Note that this equation uses degrees, whereas Java’s trigonometric functions use radians. Use Math.toRadians() and Math.toDegrees() to convert between the two. Use your program to compute the great-circle distance between Paris (48.87° N and -2.33° W) and San Francisco (37.8° N and 122.4° W).
 */

public class GreatCircle {
	public static void main(String[] args) {
		double x1 = Double.parseDouble(args[0]);
		double y1 = Double.parseDouble(args[1]);
		double x2 = Double.parseDouble(args[2]);
		double y2 = Double.parseDouble(args[3]);

		double d = 60 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1-y2)));

		System.out.println("d: " + d);
	}
}

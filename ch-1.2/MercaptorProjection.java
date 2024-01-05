/*
The Mercator projection is a conformal (angle-preserving) projection that maps latitude a1 and longitude a2 to rectangular coordinates (x, y). It is widely used—for example, in nautical charts and in the maps that you print from the web. The projection is defined by the equations x = a2 - a0 and y = 1/2 ln ((1 * sin(a1)) / (1 - sin(a1))), where a0 is the longitude of the point in the center of the map. Write a program that takes a0 and the latitude and longitude of a point from the command line and prints its projection.
 */
public class MercaptorProjection {
	public static void main(String[] args) {
		double a0 = Double.parseDouble(args[0]);
		double lat = Double.parseDouble(args[1]);
		double lng = Double.parseDouble(args[2]);

		double x = lat - a0;
		double y = 0.5 * Math.log((1 + Math.sin(lng))/(1 - Math.sin(lng)));

		System.out.println("(" + x + ", " + y + ")");
	}
}


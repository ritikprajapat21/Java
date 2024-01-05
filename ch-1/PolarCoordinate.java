public class PolarCoordinate {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		double r = Math.sqrt( x*x + y*y );

		double angle = Math.atan2(y, x);

		System.out.println("(" + r + ", " + angle + ")");
	}
}

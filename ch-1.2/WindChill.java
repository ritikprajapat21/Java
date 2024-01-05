/*
Given the temperature T (in degrees Fahrenheit) and the wind speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) as follows:
w = 35.74  0.6215 T  (0.4275 T  35.75) v 0.16
Write a program that takes two double command-line arguments temperature and velocity and prints the wind chill. Use Math.pow(a, b) to compute ab. Note : The formula is not valid if T is larger than 50 in absolute value or if v is larger than
120 or less than 3 (you may assume that the values you get are in that range).
*/

public class WindChill {
	public static void main(String args[]) {
		int t = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);

		if (Math.abs(t) > 50) {
			System.out.println("T must be less than 50");
			return;
		}
		if (v > 120 || v < 3) {
			System.out.println("V must be in between 3 and 120");
			return;
		}
		System.out.println(35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
	}
}

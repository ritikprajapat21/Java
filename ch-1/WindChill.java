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

public class GuassianRandomNumber {
	public static void main(String[] args) {
		double sin = Math.sin(2 * Math.PI * Math.random());
		double log = Math.sqrt(-2 * Math.log(Math.random()));

		System.out.println("r = " + sin * log);
	}
}

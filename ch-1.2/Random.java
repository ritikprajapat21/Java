class Random {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double c = Math.random() * (Math.max(a, b) - Math.min(a, b)) + Math.min(a, b);
		System.out.println("Random number between " +a + " and " +b + " is " + c);
	}
}

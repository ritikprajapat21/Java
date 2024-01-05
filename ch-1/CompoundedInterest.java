class CompoundedInterest {
	public static void main(String args[]) {
		int p = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		int t = Integer.parseInt(args[2]);

		System.out.println(Math.pow(p, (r * t)));
	}
}

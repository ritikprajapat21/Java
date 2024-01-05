/*
Write a program that calculates and prints the amount of money you would have after t years if you invested P dollars at an annual interest rate r (compounded continuously). The desired value is given by the formula Pert.
*/

class CompoundedInterest {
	public static void main(String args[]) {
		int p = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		int t = Integer.parseInt(args[2]);

		System.out.println(Math.pow(p, (r * t)));
	}
}

/*
   Write a program to print the instructions for drawing the dragon curves of order 0 through 5. The instructions are strings of F, L, and R characters, where F means “draw line while moving 1 unit forward,” L means “turn left,” and R means “turn right.” A dragon curve of order n is formed when you fold a strip of paper in half n times, then unfold to right angles. The key to solving this problem is to note that a curve of order n is a curve of order n-1 followed by an L followed by a curve of order n-1 traversed in reverse order, and then to figure out a similar description for the reverse curve.
 */

public class DragonCurves {
	public static void main(String[] args) {
		String order0 = "F";
		String order1 = "F" + "L" + "F";
		String order2 = "FLF" + "L" + "FRF";
		String order3 = "FLFLFRF" + "L" + "FLFRFRF";
		String order4 = "FLFLFRFLFLFRFRF" + "L" + "FRFRFLFRFRFLFLF";
		String order5 = "FLFLFRFRFRFRFRFRFLFRFRFLFRFRFLFLF" + "L" + "FRFRFLFLFLFLFLFLFRFLFLFRFLFLFRFRF";

		System.out.println("For order 0: " + order0);
		System.out.println("For order 1: " + order1);
		System.out.println("For order 2: " + order2);
		System.out.println("For order 3: " + order3);
		System.out.println("For order 4: " + order4);
		System.out.println("For order 5: " + order5);
	}
}

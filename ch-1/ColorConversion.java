/*
   Several different formats are used to represent color. For example, the primary format for LCD displays, digital cameras, and web pages, known as the RGB format, specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255. The primary format for publishing books and magazines, known as the CMYK format, specifies the level of cyan (C), magenta(M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0. Write a program RGBtoCMYK that converts RGB to CMYK. Take three integers—r, g, and b—from the command line and print the equivalent CMYK values. If the RGB values are all 0, then the CMY values are all 0 and the K value is 1; otherwise, use these formulas:
   w = max ( r / 255, g / 255, b / 255 )
     c = (w - ( r / 255)) / w
   m = (w - ( g / 255)) / w
     y = (w - ( b / 255)) / w
     k = 1 - w
 */

public class ColorConversion {
	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int g = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);

		if ((r < 0 || r > 255) || (g < 0 || g > 255) || (b < 0 || b > 255)) {
			System.out.println("Value must be in range 0 to 255");
			return;
		}

		if (r == 0 && g == 0 && b == 0) {
			System.out.println("(0, 0, 0, 1)");
			return;
		}

		double w = Math.max(r/255.0, Math.max(g/255.0, b/255.0));
		double c = (w - (r/255))/w;
		double m = (w - (g/255))/w;
		double y = (w - (b/255))/w;
		double k = 1 - w;

		System.out.println("(" + c + ", " + m + ", " + y + ", " + k + ")");
	}
}

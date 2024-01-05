/*
Write a program that takes a date as input and prints theday of the week that date falls on. Your program should accept three int command-line arguments: m (month), d (day), and y (year). For m, use 1 for January, 2 for February, and so forth. For output, print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar:
y0 = y  (14  m) / 12
x = y0  y0 / 4  y0 / 100  y0 / 400
m0 = m  12  ((14  m) / 12)  2
d0 = (d  x  (31  m0) / 12) % 7
Example:
On which day of the week did February 14, 2000 fall?
y0 = 2000  1 = 1999
x = 1999  1999 / 4  1999 / 100  1999 / 400 = 2483
m0 = 2  12  1  2 = 12
d0 = (14  2483  (31  12) / 12) % 7 = 2500 % 7 = 1
Answer :
Monday.
*/

public class DayOfTheWeek {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);

		System.out.println("Enter date in mm dd yyyy format");
		int y0 = y - (14 - m)/12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m)/12) - 2;
		int d0 = (d + x + (31 * m0)/12)%7;

		System.out.println("0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth");
		System.out.println(d0);
	}
}

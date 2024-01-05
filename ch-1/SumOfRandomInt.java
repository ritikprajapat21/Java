/*
Write a program that prints the sum of two random integers between 1 and 6 (such as you might get when rolling dice).
*/
class SumOfRandomInt {
	public static void main(String[] args) {
		int result = (int) (Math.random() * 6 + 1);
		System.out.println(result);
	}
}

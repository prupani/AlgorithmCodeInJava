import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String args[]) {
		// take inputs from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int input = scan.nextInt();
		Boolean flag = isPrime(input);
		System.out.println(flag);

	}

	/**
	 * method to check if the number is prime or not
	 */
	public static boolean isPrime(int input) {
		boolean isPrime = true;
		// Validate the input
		try {
			if (input <= 0) {
				System.out.println("Please enter number greater than 0");
			}
			int sqrt = (int) (Math.sqrt(input) + 1);
			for (int i = 2; i < sqrt; i++) {
				if (input % i == 0) {
				isPrime = false;
				break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isPrime;
	}
}
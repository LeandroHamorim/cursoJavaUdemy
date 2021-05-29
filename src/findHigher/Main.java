package findHigher;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		System.out.println("Digit a number:");
		int N = sc.nextInt();
		int numbers = 0;

		while (N <= 0) {
			System.out.println("N must be positive! Try again:");
			N = sc.nextInt();
		}

		int higher = Integer.MIN_VALUE;

		for (int i = 1; i <= N; i++) {
			System.out.print("Value #" + i + ":  ");
			numbers = sc.nextInt();

			if (numbers > higher) {
				higher = numbers;
			}
		}
		System.out.println("Higher = " + higher);
		sc.close();
	}
}

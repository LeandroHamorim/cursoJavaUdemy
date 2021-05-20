package matrix;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (j < n - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (i < m - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
				}
			}
		}
		sc.close();
	}
}

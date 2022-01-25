package vjezbanje;

import java.util.Arrays;
import java.util.Scanner;

public class Matrica {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.println("Broj redaka: ");
		int r = unos.nextInt();

		System.out.println("Broj stupaca: ");
		int s = unos.nextInt();

		int[][] matrica = new int[r][s];
		int sum = r * s;
		int b = 1;
		int r1 = r - 1;
		int r2 = 0;
		int s1 = s - 1;
		int s2 = 0;
		vanjska: while (r2 <= r1) {
			for (int i = s1; i >= s2; i--) {
				matrica[r1][i] = b;
				b++;
				if (b > sum)
					break vanjska;
			}
			r1--;

			for (int i = r1; i >= r2; i--) {

				matrica[i][s2] = b;
				b++;
				if (b > sum)
					break vanjska;
			}
			s2++;

			for (int i = s2; i <= s1; i++) {

				matrica[r2][i] = b;
				b++;
				if (b > sum)
					break vanjska;
			}
			r2++;

			for (int i = r2; i <= r1; i++) {
				matrica[i][s1] = b;
				b++;
				if (b > sum)
					break vanjska;

			}
			s1--;

		}
		System.out.println("Matrica");

		/*		for (int i = 0; i < matrica.length; i++) {
		for (int j = 0; j < matrica[0].length; j++) {
			System.out.print(matrica[i][j] + "\t");
		}
		System.out.println();

		} */

		for (int i = 0; i < matrica.length; i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}

	}
}
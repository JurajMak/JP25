package vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Matrica {

	public static void main(String[] args) {

		int r = Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
		int s = Integer.parseInt(JOptionPane.showInputDialog("Broj stupaca"));
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

		for (int i = 0; i < matrica.length; i++) {
			System.out.println(Arrays.toString(matrica[i]));
		}

	}
}
package edunova;

import javax.swing.JOptionPane;

public class Zadatak4 {

	// Program prvo nudi izbornik
	// 1. Zbrajanje
	// 2. Oduzimanje
	// 3. Množenje
	// 4. Djeljenje
	// 5. Eksponent

	// zatim unosi dva broja

	// Program ispisuje odabranu operaciju većeg broja s manjim

	public static void main(String[] args) {

		double a = Double.parseDouble(
				JOptionPane.showInputDialog("1.Zbrajanje\n2.Oduzimanje\n3.Množenje\n4.Dijeljenje\n5.Eksponent"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("BROJ"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("BROJ"));
		double sum;

		while (a == 1) {
			if (b > c) {
				sum = b + c;
				System.out.println(sum);

			} else {
				sum = c + b;
				System.out.println(sum);

			}
			break;
		}

		while (a == 2) {
			if (b > c) {
				sum = b - c;
				System.out.println(sum);

			} else {
				sum = c - b;
				System.out.println(sum);

			}
			break;
		}

		while (a == 3) {
			if (b > c) {
				sum = b * c;
				System.out.println(sum);

			} else {
				sum = c * b;
				System.out.println(sum);

			}
			break;
		}

		while (a == 4) {
			if (b > c) {
				sum = b / c;
				System.out.println(sum);

			} else {
				sum = c / b;
				System.out.println(sum);

			}
			break;
		}

		while (a == 5) {
			if (b > c) {
				sum = Math.pow(b, c);
				System.out.println(sum);

			} else {
				sum = Math.pow(c, b);
				System.out.println(sum);

			}
			break;
		}

	}
}

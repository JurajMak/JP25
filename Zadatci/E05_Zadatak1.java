package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	// Program prima dva broja i ispisuje sve brojeve jedno ispod drugog
	// između dva primljena broja od manjeg prema većem

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("BROJ"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("BROJ"));

		int i;

		while (a < b || a == b) {
			for (i = a; i <= b; i++) {
				System.out.println(i);

			}
			break;
		}

		while (a > b) {
			for (i = b; i <= a; i++) {
				System.out.println(i);
			}
			break;
		}

	}
}

package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Program prima jedan broj i ispisuje sve parne brojeve
	// od primljenog broja do broja 2 jedno pokraj drugog odvojeno zarezom.
	// Zadnji zarez se ne ispisuje

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Broj"));

		while (a >= 4) {
			if (a % 2 == 0) {
				System.out.print(a + ",");

			}
			a--;
		}
		System.out.print(2);

	}

}
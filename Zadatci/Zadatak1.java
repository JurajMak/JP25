package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	// Program učitava 3 broja u niz
	// Ispisuje najveći
	// Ne smijete koristiti niti jednu drugu varijablu osim deklariranog niza

	public static void main(String[] args) {

		int[] niz = new int[3];

		niz[0] = Integer.parseInt(JOptionPane.showInputDialog("Broj"));

		niz[1] = Integer.parseInt(JOptionPane.showInputDialog("Broj"));

		niz[2] = Integer.parseInt(JOptionPane.showInputDialog("Broj"));

		if (niz[0] >= niz[1] & niz[0] >= niz[2]) {
			System.out.println(niz[0]);
		} else if (niz[1] >= niz[0] & niz[1] >= niz[2]) {
			System.out.println(niz[1]);
		} else System.out.println(niz[2]);
			
		

	}
}

package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Program od korisnika traži unos dva cijela broja
	// S vrijednostima unesenih brojeva deklarirajte matricu

	// primjer: Čovjek unese 5 i 6, vi napravite matricu 5x6
	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Broj"));

		int b = Integer.parseInt(JOptionPane.showInputDialog("Broj"));

		int[][] unos = new int[a][b];

		System.out.println(Arrays.toString(unos));

	}
}

package vjezbanje;

import javax.swing.JOptionPane;

public class mnozenje {

	public static void main(String[] args) {

		float a = Float.parseFloat(JOptionPane.showInputDialog("Pomnoži broj"));

		float b = Float.parseFloat(JOptionPane.showInputDialog("Sa brojem"));

		System.out.println("Rezultat je: " + (a * b));
	}

}

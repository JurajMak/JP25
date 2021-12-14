package vjezbanje;

import javax.swing.JOptionPane;

public class zbrajanje {

	public static void main(String[] args) {

		float a = Float.parseFloat(JOptionPane.showInputDialog("Zbroji broj"));

		float b = Float.parseFloat(JOptionPane.showInputDialog("Sa brojem"));

		System.out.println("Rezultat je: "+(a + b));

	}
}

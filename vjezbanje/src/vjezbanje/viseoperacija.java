package vjezbanje;

import javax.swing.JOptionPane;

public class viseoperacija {

	public static void main(String[] args) {

		double a = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj!"));

		String oper = JOptionPane.showInputDialog("Odaberi operaciju");

		double b = Double.parseDouble(JOptionPane.showInputDialog("Upiši broj"));

		if (oper.equals("+")) {
			System.out.println("Rezultat je: " + (a + b));
		}

		if (oper.equals("-")) {
			System.out.println("Rezultat je: " + (a - b));
		}

		if (oper.equals("/")) {
			System.out.println("Rezultat je: " + (a / b));
		}

		if (oper.equals("*")) {
			System.out.println("Rezultat je: " + (a * b));
		}

	}

}

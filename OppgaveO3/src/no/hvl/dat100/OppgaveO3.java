package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {

		String tallStr = showInputDialog("skriv et heltall ");
		int tall = Integer.parseInt(tallStr);
		long i, fak = 1;

		for (i = 1; i <= tall; i++) {
			fak = fak * i;
		}
		System.out.println("Fakultet av " + tall + " er: " + fak);

	}

}

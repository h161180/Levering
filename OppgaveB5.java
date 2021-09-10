package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB5 {

	public static void main(String[] args) {

		for (int antall = 1; antall <= 2; antall++) {
			String poengsumStr = showInputDialog("Hvor mange poeng fikk du på prøven? ");
			int poengsum = Integer.parseInt(poengsumStr);

			if (90 <= poengsum && poengsum <= 100) {
				showMessageDialog(null, "Du fikk karakteren A ");
			} else if (80 <= poengsum && poengsum <= 89) {
				showMessageDialog(null, "Du fikk karakteren B ");
			} else if (60 <= poengsum && poengsum <= 79) {
				showMessageDialog(null, "Du fikk karakteren C ");
			} else if (50 <= poengsum && poengsum <= 59) {
				showMessageDialog(null, "Du fikk karakteren D ");
			} else if (40 <= poengsum && poengsum <= 49) {
				showMessageDialog(null, "Du fikk karakteren E ");
			} else if (0 <= poengsum && poengsum <= 39) {
				showMessageDialog(null, "Du fikk karakteren F ");
			} else if (0 > poengsum) {
				showInputDialog("Ugyldig poengsum, skriv inn på nytt ");
			} else if (100 < poengsum) {
				showInputDialog("Ugyldig poengsum, skriv inn på nytt ");
			}

		}
	}
}

package no.hvl.dat100;

import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Math.*;

public class OppgaveB4 {

	public static void main(String[] args) {

		String bruttoStr = showInputDialog("Hva er din brutto inntekt? ");
		int brutto = Integer.parseInt(bruttoStr);

		// De ulike skatte trinnene og hvor mye det vil medføre
		double trinn = brutto;
		double trinn1 = brutto * 0.017;
		double trinn2 = brutto * 0.04;
		double trinn3 = brutto * 0.132;
		double trinn4 = brutto * 0.162;

		if (0 <= brutto && brutto <= 184800) {
			System.out.println("Din trinnskatt kommer på kr: " + trinn);
		}

		else if (184801 <= brutto && brutto <= 260100) {
			System.out.println("Din trinnskatt kommer på kr: " + trinn1);
		}

		else if (260101 <= brutto && brutto <= 651250) {
			System.out.println("Din trinnskatt kommer på kr: " + trinn2);

		}

		else if (651251 <= brutto && brutto <= 1021550) {
			System.out.println("Din trinnskatt kommer på kr " + trinn3);
		}

		else if (1021550 <= brutto) {
			System.out.println("Din trinnskatt kommer på kr: " + trinn4);
		}
	}

}

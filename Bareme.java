import java.util.ArrayList;

import lombok.Data;

@Data
public class Bareme {
	
	private ArrayList<Tranche> tranches;
	
	public Bareme() {
		this.tranches = new ArrayList<Tranche>();
	}
	
	public Bareme(ArrayList<Tranche> tranches) {
		this.tranches = tranches;
	}
	
	public int impot(double revenuNetGlobalImposable, double nombreDeParts) {
		
		double impot = 0;
		
		// Calcul du quotient familial
		double quotientFamilial = revenuNetGlobalImposable / nombreDeParts;
		
		// Calcul de l'impact de chaque tranche
		for (Tranche tranche : tranches) {
			if (quotientFamilial < tranche.getMinimum()) {
				// Tranche inférieure
			} else if ((quotientFamilial < tranche.getMaximum()) || (tranche.getMaximum() == 0)) { // Dernière tranche prise en compte
				impot += (quotientFamilial - tranche.getMinimum()) * tranche.getTaux();
			} else {
				impot += (tranche.getMaximum() - tranche.getMinimum()) * nombreDeParts * tranche.getTaux(); // Tranche intermédiaire
			}
		}
		
		// Multiplication par le nombre de parts
		impot *= nombreDeParts;
		
		// Si l'impot est inférieur à 61 euros, le montant est nul
		impot = impot < 61 ? 0 : impot;
		
		return (int) Math.round(impot);
	}
}

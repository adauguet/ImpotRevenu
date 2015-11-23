public class Main {

	public static void main(String[] args) {
		
		// Initialisation des barêmes		
		Bareme bareme2016revenus2015 = new Bareme();
		bareme2016revenus2015.getTranches().add(new Tranche(0, 9700, 0));
		bareme2016revenus2015.getTranches().add(new Tranche(9700, 26791, 0.14));
		bareme2016revenus2015.getTranches().add(new Tranche(26791, 71826, 0.3));
		bareme2016revenus2015.getTranches().add(new Tranche(71826, 152108, 0.41));
		bareme2016revenus2015.getTranches().add(new Tranche(152108, 0, 0.45));
		
		Bareme bareme2015revenus2014 = new Bareme();
		bareme2015revenus2014.getTranches().add(new Tranche(0, 9690, 0));
		bareme2015revenus2014.getTranches().add(new Tranche(9690, 26764, 0.14));
		bareme2015revenus2014.getTranches().add(new Tranche(26764, 71754, 0.3));
		bareme2015revenus2014.getTranches().add(new Tranche(71754, 151956, 0.41));
		bareme2015revenus2014.getTranches().add(new Tranche(151956, 0, 0.45));
	}
}

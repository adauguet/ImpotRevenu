import lombok.Data;

@Data
public class Tranche {
	
	private double minimum;
	private double maximum;
	private double taux;
	
	public Tranche(double minimum, double maximum, double taux) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.taux = taux;
	}
}

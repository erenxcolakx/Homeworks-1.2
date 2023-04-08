
public class Dairy extends Food {

	public Dairy() {
		super(8.0);
		// TODO Auto-generated constructor stub
	}
	public Dairy(double basePrice) {
		super(basePrice);
	}

	@Override
	public double calculatePrice() {
		double retailPrice = getBasePrice()*(1 + getVat()) * 1.3;
		return retailPrice;
	}

}
// Eren Çolak -150121015
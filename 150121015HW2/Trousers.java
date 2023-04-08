
public class Trousers extends Clothing {

	public Trousers(double basePrice) {
		super(basePrice);
		// TODO Auto-generated constructor stub
	}
	public Trousers() {
		super(40.0);
	}

	@Override
	public void howToWash() {
		System.out.println("Wash Trousers at 30 degrees.");
		
	}

	@Override
	public double calculatePrice() {
		double retailPrice = getBasePrice()*(1 + getVat()) * 1.2;
		return retailPrice;
	}

}
// Eren Çolak - 150121015
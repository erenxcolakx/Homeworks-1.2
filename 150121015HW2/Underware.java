
public class Underware extends Clothing {

	public Underware(double basePrice) {
		super(basePrice);
		// TODO Auto-generated constructor stub
	}
	public Underware(){
		super(30.0);
	}

	@Override
	public void howToWash() {
		System.out.println("Wash Underware at 60 degrees.");
		
	}

	@Override
	public double calculatePrice() {
		double retailPrice = getBasePrice()*(1 + getVat()) * 1.45;
		return retailPrice;
	}

}
// Eren Çolak - 150121015
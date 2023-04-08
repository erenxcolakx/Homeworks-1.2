
public class Top extends Clothing{

	public Top(double basePrice) {
		super(basePrice);
		// TODO Auto-generated constructor stub
	}
	public Top() {
		super(20.0);
	}
	@Override
	public void howToWash() {
		System.out.println("Wash Top at 40 degrees.");
		
	}
	@Override
	public double calculatePrice() {
		double retailPrice = getBasePrice()*(1 + getVat()) * 1.2;
		return retailPrice;
	}

}
// Eren Çolak - 150121015

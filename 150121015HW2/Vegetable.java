
public class Vegetable extends Food implements Vegan,Washable {

	public Vegetable(double basePrice) {
		super(basePrice);
		// TODO Auto-generated constructor stub
	}
	public Vegetable() {
		super(10.0);
	}

	@Override
	public void howToWash() {
		System.out.println("Wash Vegetable with warm water.");
		
	}

	@Override
	public void madeOf() {
		System.out.println("It is made only of vegetables.");
		
	}

	@Override
	public double calculatePrice() {
		double retailPrice = getBasePrice()*(1 + getVat()) * 1.25;
		return retailPrice;
	}

}
// Eren Çolak - 150121015
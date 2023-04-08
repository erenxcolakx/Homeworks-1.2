
public class Fruit extends Food implements Vegan,Washable{

	public Fruit(double basePrice) {
		super(basePrice);
		// TODO Auto-generated constructor stub
	}
	public Fruit() {
		super(6.0);
	}
	@Override
	public void howToWash() {
		System.out.println("Wash Fruit with cold water.");
		
	}

	@Override
	public void madeOf() {
		System.out.println("It is made only of fruits.");
		
	}
	@Override
	public double calculatePrice() {
		double retailPrice = getBasePrice()*(1 + getVat()) * 1.2;
		return retailPrice;
	}

}
// Eren Çolak - 150121015
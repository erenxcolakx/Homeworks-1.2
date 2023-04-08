
public abstract class Item {
	private double vat;
	private double basePrice;
	
	public Item(double vat, double basePrice) {
		this.vat = vat; //The data field vat represents value added tax for each item.
		this.basePrice = basePrice; //The data field basePrice represents the price of the item when there is no taxes or profit added.
	}
	public abstract double calculatePrice();
	
	
	public double getVat() {
		return vat;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public void setBaseprice(double baseprice) {
		this.basePrice = baseprice;
	}
}
// Eren Çolak - 150121015
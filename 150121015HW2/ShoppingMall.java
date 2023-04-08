import java.util.ArrayList;

public class ShoppingMall {
	private static ArrayList<Item> items;
	public ShoppingMall() {
	      items = new ArrayList<Item>();
	  }
	public ArrayList<Item> getItems() {
	      return items;
	  }
	public void addDairy() {
	      items.add(new Dairy());
	  }
	public void addFruit() {
	      items.add(new Fruit());
	  }
	
	public void addTop() {
	      items.add(new Top());
	  }
	
	public void addTrousers() {
	      items.add(new Trousers());
	  }
	
	public void addUnderware() {
	      items.add(new Underware());
	  }
	
	public void addVegetable() {
	      items.add(new Vegetable());
	  }
	
	public void addArbitrary(Item item) {
	      items.add(item);
	  }
	public double bill() {
		 double totalBill = 0.0;
	        for (Item item : items) {
	            totalBill += item.calculatePrice();
	        }
	        return totalBill;
		
	}
}
// Eren Çolak-150121015
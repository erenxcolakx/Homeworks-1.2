
public class Test {

	public static void main(String[] args) {
		ShoppingMall mall=new ShoppingMall();
		mall.addDairy();
		mall.addFruit();
		mall.addTop();
		mall.addTrousers();
		mall.addUnderware();
		mall.addVegetable();
		Top newTop = new Top(100.0);
		mall.addArbitrary(newTop);
		
		printContent(mall);
		printWashingInstructions(mall);
		
		double totalBill = mall.bill();
		System.out.println("Total bill: $" + totalBill);
		
	}

	public static void printContent(ShoppingMall mall) {
		// prints madeOf by iterating object list of mall
		for(Item item : mall.getItems()) {
			if(item instanceof Vegan) {
				((Vegan)item).madeOf();
			}
		}
		
	}

	public static void printWashingInstructions(ShoppingMall mall) {
		// prints washing instructions by iterating object list of mall
		for(Item item : mall.getItems()) {
			if(item instanceof Washable) {
				((Washable)item).howToWash();
			}
		}
		
	}

}
//Eren Çolak- 150121015

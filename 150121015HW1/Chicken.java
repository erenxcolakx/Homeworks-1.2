public class Chicken extends Bird {
	private static int count;
	public Chicken(String name, int age) {
		super(name,age);
		setLegNumber(2);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(200);
		Chicken.count++;
	}
	@Override
	public void sayGreetings() {
		System.out.println("I have nothing to say other than I am against Pigs!");
	}
	public static int getCount(){
		return Chicken.count;
	}
	public static void decrementCount(){
		Chicken.count--;
	}
	
}
//Eren Çolak - 150121015
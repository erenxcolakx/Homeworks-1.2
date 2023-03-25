
public class Horse extends Mammal {
	private static int count;
	public Horse(String name,int age) {
		super(name,age);
		setLegNumber(4);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(1);;
		Horse.count++;
	}
	@Override
	public void sayGreetings() {
		System.out.println("I will work harder!");
	}
	public static int getCount(){
		return Horse.count;
	}
	public static void decrementCount(){
		Horse.count--;
	}

}
//Eren Çolak - 150121015
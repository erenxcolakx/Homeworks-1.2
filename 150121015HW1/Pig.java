
public class Pig extends Mammal {
	private static int count;
	public Pig(String name,int age) {
		super(name,age);
		setLegNumber(4);
		setNumberOfOffsprings(12);
		setPregnancyPerYear(2);;
		Pig.count++;
	}
	@Override
	public void sayGreetings() {
		System.out.println("All animals are equal, but some animals are more equal than others!");
	}
	public static int getCount(){
		return Pig.count;
	}
	public static void decrementCount(){
		Pig.count--;
	}
}
//Eren Çolak - 150121015
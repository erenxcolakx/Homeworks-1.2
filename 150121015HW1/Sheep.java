
public class Sheep extends Mammal {
	private static int count;
	public Sheep(String name, int age) {
		super(name,age);
		setLegNumber(4);
		setNumberOfOffsprings(1);
		setPregnancyPerYear(1);
		Sheep.count++;
	}
	public void sayGreetings() {
		System.out.println("A happy country where we poor animals shall rest forever!");
	}
	public static int getCount(){
		return Sheep.count;
	}
	public static void decrementCount(){
		Sheep.count--;
	}
}
//Eren Çolak - 150121015
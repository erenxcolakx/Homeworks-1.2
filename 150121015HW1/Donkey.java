public class Donkey extends Mammal {
	private static int count;
	public Donkey(String name,int age) {
		super(name,age);
		super.setLegNumber(4);
		super.setNumberOfOffsprings(1);
		super.setPregnancyPerYear(1);;
		Donkey.count++;
	}
	@Override
	public void sayGreetings() {
		System.out.println("Life will go on as it has always gone –that is, badly!");
	}
	public static int getCount(){
		return Donkey.count;
	}
	public static void decrementCount(){
		Donkey.count--;
	}
	
}

//Eren Çolak - 150121015

public class Animal {
	private String name;
	private int legNumber;
	private int age;
	private int pregnancyPerYear;
	private int numberOfOffsprings;
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void sayGreetings() {
		System.out.println("Have nothing to say!");
	}
	public void reproduce() {
		System.out.println("None of your business!!");
	}
	public String toString() {
		return "My name is " + this.name + "!\nI am " + this.age+" years old!\nI have " +this.legNumber+" legs!\n";
	}
	public String getName() {
		return name;
	}
	public int getLegNumber() {
		return legNumber;
	}
	public int getAge() {
		return age;
	}
	public int getPregnancyPerYear() {
		return pregnancyPerYear;
	}
	public int getNumberOfOffsprings() {
		return numberOfOffsprings;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLegNumber(int legNumber) {
		this.legNumber = legNumber;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPregnancyPerYear(int pregnancyPerYear) {
		this.pregnancyPerYear = pregnancyPerYear;
	}
	public void setNumberOfOffsprings(int numberOfOffsprings) {
		this.numberOfOffsprings = numberOfOffsprings;
	}
}
// Eren Çolak - 150121015
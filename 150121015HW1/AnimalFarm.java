import java.util.ArrayList;
import java.lang.Exception;
public class AnimalFarm {
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	ArrayList<String> animalNames= new ArrayList<String>();
	private int CAPACITY;
	private static int numberOfAnimals = 0;
	public AnimalFarm(int capacity) {
		this.CAPACITY=capacity;
	}
	public int getNumberOfAnimals() {
		return AnimalFarm.numberOfAnimals;
	}
	
	public boolean addAnimal(Animal animal) throws IllegalNameException {
		if (animalList.size() >= CAPACITY) {
		     return false;
		     }
		if (animalNames.contains(animal.getName())) {
			 throw new IllegalNameException("Animal is already exist");
			 }
		setNumberOfAnimals(this.getNumberOfAnimals()+1); //Animal number increased
		animalList.add(animal); //Animal object added
		animalNames.add(animal.getName()); //Animal name added
		return true;
		}
	public boolean removeAnimal(String name)throws IllegalNameException {
		//I iterate arraylists and Deleted object and name from arraylists
		for (Animal object : animalList) {
			if(object.getName().equals(name)) {
				if(object instanceof Chicken) {
					Chicken.decrementCount();
					animalList.remove(object);
					setNumberOfAnimals(this.getNumberOfAnimals()-1);
					return true;}
				else if(object instanceof Donkey) {
					Donkey.decrementCount();
					animalList.remove(object);
					setNumberOfAnimals(this.getNumberOfAnimals()-1);
					return true;}
				else if(object instanceof Horse) {
					Horse.decrementCount();
					animalList.remove(object);
					setNumberOfAnimals(this.getNumberOfAnimals()-1);
					return true;}
				else if(object instanceof Pig) {
					Pig.decrementCount();
					animalList.remove(object);
					setNumberOfAnimals(this.getNumberOfAnimals()-1);
					return true;}
				else if(object instanceof Raven) {
					Raven.decrementCount();
					animalList.remove(object);
					setNumberOfAnimals(this.getNumberOfAnimals()-1);
					return true;}
				else if(object instanceof Sheep) {
					Sheep.decrementCount();
					animalList.remove(object);
					setNumberOfAnimals(this.getNumberOfAnimals()-1);
					return true;}
				else {
					throw new IllegalNameException("Animal can't be found");
					}
			}
		}
		for (int i = 0; i < animalNames.size(); i++) {
			if (animalNames.get(i).equals(name)) {
				animalNames.remove(i);
			}
		}
		return true; 
	}
	public void printAllAnimalGreetings() {
		for (Animal animal : animalList) {
			animal.sayGreetings();
		}
	}
	public void printOneAnimalGreeting(Animal animal) {
		animal.sayGreetings();
	}
	public void printOneAnimalName(Animal animal) {
		animal.getName();
	}
	public void printAllAnimals(){
		for (Animal animal : animalList) {
			System.out.println(animal.getName());
		}
	}
	public int nextYearPopulationForecast() {
		int totalPopulation=0;
		int currentPopulation = getNumberOfAnimals();
		totalPopulation += currentPopulation;
		for (Animal object : animalList) {
			totalPopulation += 
					(object.getNumberOfOffsprings())
					*object.getPregnancyPerYear();
		}
		return totalPopulation;
	}
	public void animalMovements() {
		for(Animal object : animalList) {
			if(object instanceof Bird) {
				System.out.printf("My name is %s and ",object.getName());
				((Bird) object).fly();
				}
			if(object instanceof Mammal) {
				System.out.printf("My name is %s and ",object.getName());
				((Mammal) object).walk();
			}
		}
	}
	public void eatingHabits() {
		for(Animal object : animalList) {
			if(object instanceof Bird) {
				System.out.printf("My name is %s and ",object.getName());
				((Bird) object).omnivore();;
				}
			if(object instanceof Mammal) {
				System.out.printf("My name is %s and ",object.getName());
				((Mammal) object).herbivore();;
			}
		}
	}
	public void sortAlphabetically() {
		Animal[] Alph = new Animal[animalList.size()];
		for (int i = 0; i < Alph.length; i++) {
			Alph[i]=animalList.get(i);
		}
		for (int i = 0; i < Alph.length-1; i++) {
			for (int j = i+1; j < Alph.length; j++) {
				if(Alph[i].getName().compareToIgnoreCase(Alph[j].getName()) > 0) {
					Animal tempObject = Alph[i];
					Alph[i] = Alph[j];
					Alph[j] = tempObject;
				}
			}
		}
		for (Animal animal : Alph) {
			System.out.printf("My name is %s\n",animal.getName());
		}
		}
	public void sortBasedOnLegNumber() {
		Animal[] animalSortLegArray = new Animal[animalList.size()];
		for (int i = 0; i < animalSortLegArray.length; i++) {
			animalSortLegArray[i]=animalList.get(i);
		}
		for (int i = 0; i < animalSortLegArray.length-1; i++) {
			for (int j = 0; j < animalSortLegArray.length-i-1; j++) {
				if(animalSortLegArray[j].getLegNumber()> animalSortLegArray[j+1].getLegNumber()) {
					Animal tempObject = animalSortLegArray[j];
					animalSortLegArray[j] = animalSortLegArray[j+1];
					animalSortLegArray[j+1] = tempObject;
				}
			}
		}
		for (Animal animal : animalSortLegArray) {
			System.out.printf("%s has %d legs!\n",animal.getName(),animal.getLegNumber());
		}
		
	}
	public void sortBasedOnAge() {
		Animal[] animalSortAgeArray = new Animal[animalList.size()];
		for (int i = 0; i < animalSortAgeArray.length; i++) {
			animalSortAgeArray[i]=animalList.get(i);
		}
		for (int i = 0; i < animalSortAgeArray.length-1; i++) {
			for (int j = 0; j < animalSortAgeArray.length-i-1; j++) {
				if(animalSortAgeArray[j].getAge()> animalSortAgeArray[j+1].getAge()) {
					Animal tempObject = animalSortAgeArray[j];
					animalSortAgeArray[j] = animalSortAgeArray[j+1];
					animalSortAgeArray[j+1] = tempObject;
				}
			}
		}
		for (Animal animal : animalSortAgeArray) {
			System.out.printf("%s is %d years old!\n",animal.getName(),animal.getAge());
		}
	}
	public void searchBasedOnName(String name) {
		for (Animal object : animalList) {
			if (object.getName().equals(name)) {
				System.out.println(object.toString());
			}
		}
	}
	public void searchBasedOnAge(int age) {
		for (Animal object : animalList) {
			if (object.getAge()== age) {
				System.out.println(object.toString());		
			}
		}
	}
	
	public void printReport(String filename) throws Exception {
		java.io.File file = new java.io.File(filename);
		if (file.exists()) {
			System.out.println("File already exist");
			System.exit(0);
		}
			java.io.PrintWriter output = new java.io.PrintWriter(file);
			output.printf("We have a total of %s animals in the farm\n", numberOfAnimals);
				if(Chicken.getCount()>0) {
					output.printf("		*%d of them are Chicken. Those are:\n",Chicken.getCount());
					output.println("		Name			Age				Leg Number");
						for (Animal object : animalList) {
							if(object instanceof Chicken) {
								output.printf("		%s			%d				%d\n",object.getName(),object.getAge(),object.getLegNumber());
								
							}
						}
				}
				if(Donkey.getCount()>0) {
					output.printf("		*%d of them are Donkey. Those are:\n",Donkey.getCount());
					output.println("		Name			Age				Leg Number");
						for (Animal object : animalList) {
							if(object instanceof Donkey) {
								output.printf("		%s			%d				%d\n",object.getName(),object.getAge(),object.getLegNumber());
								
							}
						}
				}
				if(Horse.getCount()>0) {
					output.printf("		*%d of them are Horse. Those are:\n",Horse.getCount());
					output.println("		Name			Age				Leg Number");
						for (Animal object : animalList) {
							if(object instanceof Horse) {
								output.printf("		%s			%d				%d\n",object.getName(),object.getAge(),object.getLegNumber());
								
							}
						}
				}
				if(Pig.getCount()>0) {
					output.printf("		*%d of them are Pig. Those are:\n",Pig.getCount());
					output.println("		Name			Age				Leg Number");
						for (Animal object : animalList) {
							if(object instanceof Pig) {
								output.printf("		%s			%d				%d\n",object.getName(),object.getAge(),object.getLegNumber());
								
							}
						}
				}
				if(Raven.getCount()>0) {
					output.printf("		*%d of them are Raven. Those are:\n",Raven.getCount());
					output.println("		Name			Age				Leg Number");
						for (Animal object : animalList) {
							if(object instanceof Raven) {
								output.printf("		%s			%d				%d\n",object.getName(),object.getAge(),object.getLegNumber());
								
							}
						}
				}
				if(Sheep.getCount()>0) {
					output.printf("		*%d of them are Sheep. Those are:\n",Sheep.getCount());
					output.println("		Name			Age				Leg Number");
						for (Animal object : animalList) {
							if(object instanceof Sheep) {
								output.printf("		%s			%d				%d\n",object.getName(),object.getAge(),object.getLegNumber());
								
							}
						}
				}
				output.close();
			
		
	}
	public static void setNumberOfAnimals(int numberOfAnimals) {
		AnimalFarm.numberOfAnimals = numberOfAnimals;
	}
	
}

//Eren Çolak - 150121015
import java.util.Scanner;
public class Test {
	public static void main(String[] args) throws Exception {
	Scanner input = new Scanner(System.in);
	System.out.print("Welcome to Animal Farm simulation program!\n");
	System.out.print("Please enter the capacity of the animal farm: ");	
	int capacity=input.nextInt();
	AnimalFarm newFarm = new AnimalFarm(capacity);
	while (true){
		System.out.println(
		" 0 - Exit the program\n"
	+   " 1 - Add animal\n"
	+ 	" 2 - Remove animal\n"
	+ 	" 3 - Search animal\n"
	+ 	" 4 - Sort animals\n"
	+ 	" 5 - Calculate next year's population estimate\n"
	+ 	" 6 - Print all animal's movements\n"
	+ 	" 7 - Print all animal's eating habits\n"
	+ 	" 8 - Print report\n"
	+ 	" Please enter your choice: ");
		int choice = input.nextInt();
		if(choice == 0) { // Exit
			System.out.println("Exited");
			break;
		}
		else if (choice == 1) { // Add animal
			
			System.out.println(
						" 1 - Chicken\n"
					+ 	" 2 - Donkey\n"
					+ 	" 3 - Horse\n"
					+ 	" 4 - Pig\n"
					+ 	" 5 - Raven\n"
					+ 	" 6 - Sheep\n");
			System.out.print("Select animal type: ");
			int animalChoice=input.nextInt();
			System.out.println();
			System.out.print("Enter the name:");
			input.nextLine();
			String animalName= input.nextLine();
			System.out.println();
			System.out.println("Enter the age:\n ");
			int animalAge = input.nextInt();
			switch (animalChoice) {
			case 1:
				Chicken newChicken = new Chicken(animalName,animalAge);
				try {
					if(newFarm.addAnimal(newChicken)) {}
					else {System.out.println("Capacity is full");} 
				}
				catch(IllegalNameException e){
					System.out.println("Animal is already exist. Animal can't added");
				}
				break;
			case 2:
				Donkey newDonkey = new Donkey(animalName,animalAge);
				try {
					if(newFarm.addAnimal(newDonkey)) {}
					else {System.out.println("Capacity is full");} 	
				}
				catch(IllegalNameException e){
					System.out.println("Animal is already exist. Animal can't added");
				}
				break;
			case 3:
				Horse newHorse = new Horse(animalName,animalAge);
				try {
					if(newFarm.addAnimal(newHorse)) {}
					else {System.out.println("Capacity is full");} 	
				}
				catch(IllegalNameException e){
					System.out.println("Animal is already exist. Animal can't be added");
				}
				break;
			case 4:
				Pig newPig = new Pig(animalName,animalAge);
				try {
					if(newFarm.addAnimal(newPig)) {}
					else {System.out.println("Capacity is full");} 	
				}
				catch(IllegalNameException e){
					System.out.println("Animal is already exist. Animal can't be added");
				}
				break;
			case 5:
				Raven newRaven = new Raven(animalName,animalAge);
				try {
					if(newFarm.addAnimal(newRaven)) {}
					else {System.out.println("Capacity is full");} 	
				}
				catch(IllegalNameException e){
					System.out.println("Animal is already exist. Animal can't be added");
				}
				break;
			case 6:
				Sheep newSheep = new Sheep(animalName,animalAge);
				try {
					if(newFarm.addAnimal(newSheep)) {}
					else {System.out.println("Capacity is full");} 	
				}
				catch(IllegalNameException e){
					System.out.println("Animal is already exist. Animal can't be added");
				}
				break;
			default:
				System.out.println("Wrong number");
				break;
			}
		}
		else if (choice == 2) { // Remove animal
			System.out.print("Type animal name you want to delete: ");
			input.nextLine();
			String animalName=input.nextLine();
			try{newFarm.removeAnimal(animalName);}
			catch(IllegalNameException e) {
				System.out.println("Animal can't be found");
			}
			}
		else if (choice == 3) { // Search animal
		while(true) {
			System.out.println(
					"1 - Search based on name\n"
				+   "2 - Search based on age ");
		int basedWhich= input.nextInt();
		input.nextLine();
		
			if(basedWhich==1) {
				// on Name
				System.out.print("Type animal name you want to search: ");
				String animalName=input.nextLine();
				newFarm.searchBasedOnName(animalName);
				break;
			}
			else if(basedWhich==2) {
				// on Age
				System.out.print("Type animal age you want to search: ");
				int animalAge=input.nextInt();
				newFarm.searchBasedOnAge(animalAge);
				break;
			}
			else {
				System.out.println("You entered wrong number");
				}
			}
		}
		
		else if (choice == 4) { // Sort animals
			while (true) {
			System.out.println(
					" 1 - Sort based on name\n"
				+   " 2 - Sort based on leg number\n"
				+ 	" 3 - Sort based on age\n"
				+ 	" 4 - Sort based on addition date\n");
			int sortOption = input.nextInt();
			if		(sortOption==1) { // Based on name
				newFarm.sortAlphabetically();
				break;
			}
			else if (sortOption==2) { // Based on leg number
				newFarm.sortBasedOnLegNumber();
				break;
			}
			else if (sortOption==3) { // Based on age
				newFarm.sortBasedOnAge();
				break;
			}
			else if (sortOption==4) { // Based on addition time
				newFarm.printAllAnimals();
				break;
			}
			else {
				System.out.println("You entered wrong number");
			}
				
			}
				
		}
		else if (choice == 5) { // Calculate next year's population estimate
			System.out.println(newFarm.nextYearPopulationForecast());
		}
		else if (choice == 6) { // Print all animal's movements
			newFarm.animalMovements();
		}
		else if (choice == 7) { // Print all animal's eating habits
			newFarm.eatingHabits();
		}
		else if (choice == 8) { // Print Report
			while(true) {
				input.nextLine();
				System.out.println("Enter filename:");
				String fileName = input.nextLine();
				if(fileName.endsWith(".txt")) {
					java.io.File file = new java.io.File(fileName);
					newFarm.printReport(fileName);
					System.out.println("Report saved");
				}
				else {
					System.out.println("You should write file type. Press Enter");
				}
			}
		}
		else {
			System.out.println("Wrong number");
		}
	}
	}
}
//Eren Çolak - 150121015
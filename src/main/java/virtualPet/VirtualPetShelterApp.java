package virtualPet;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter vPets = new VirtualPetShelter();

		VirtualPet petOne = new VirtualPet("Otto", "Dachshund", 50, 50, 50);
		VirtualPet petTwo = new VirtualPet("Mocha", "Chocolate Lab", 50, 50, 50);
		VirtualPet petThree = new VirtualPet("Jasmine", "Tiebetan Terrier", 50, 50, 50);

		vPets.add(petOne);
		vPets.add(petTwo);
		vPets.add(petThree);

		String decision = "";
		while (!decision.equalsIgnoreCase("Yes")) {
//-----------This one will show up on the console first-----------------------------------------------------

			System.out.println("Welcome to Virtual Pet shelter!");
			System.out.println("These are all the pets names and ");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom\t");
			System.out.println("--------|-------|-------|-------");
			System.out.println(vPets.petStatus());

// ------------------------------------------------------------------------------
			System.out.println("What would you like to do\n next with your pets?");

			System.out.println("1. Feed your pets");
			System.out.println("2. Water your pets");
			System.out.println("3. Play one pet");
			System.out.println("4. Admit a pet");
			System.out.println("5. Adopt a pet");
			System.out.println("6. Exit game");

// -----------------User input-----------------------------------------------
			String choiceEntered = input.nextLine();
			if (choiceEntered.equals("1")) {
				vPets.feedAll();
				System.out.println("All pets were fed");
			} else if (choiceEntered.equals("2")) {
				vPets.waterAll();
				System.out.println("All pets were given water");

			} else if (choiceEntered.equals("3")) {
				System.out.println("\nWhich one would you like to play with?");
				System.out.println(vPets.showAllPets());
				String petName = input.nextLine();
				// action executed

				vPets.play(petName);
				System.out.println("You played with " + petName + ".");

			} else if (choiceEntered.equals("4")) {
				System.out.println("Adopt a Pet:");
				System.out.println("\n Which pet would you like to adopt?");
				System.out.println(vPets.showAllPets());
				String petName = input.nextLine();

				if (!vPets.doesPetStay(petName)) {
					System.out.println("uh... we dont know any animal by that name...");
				} else {
					vPets.adopt(petName);
					System.out.println("You adopted" + petName + ".");
				}
				// -----this one below is separate---------

			} else if (choiceEntered.equals("5")) {
				System.out.println("What is the name of the pet you are checking in?:");
				String newPetName = input.nextLine();

				System.out.println("Enter a desciption of the pet:");
				String newPetDescription = input.nextLine();

				vPets.add(new VirtualPet(newPetName, newPetDescription));

				System.out.println("thank you for adding this one to the family!");

			} else if (choiceEntered.equals("6")) {
				System.out.println("Are you sure you want to quit?/nEnter yes or no");
				decision = input.nextLine();

				if (decision.equalsIgnoreCase("Yes")) {
					System.out.println("You have given up on the pets.. great job....");

				} else {
					decision.equalsIgnoreCase("No");
					System.out.println("Well look who decided to stay! Great job...");

				}

			}
			vPets.tickPets();

		}
		input.close();
	} // for the while loop

}

package virtualPet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {

	public Map<String, VirtualPet> vPets = new HashMap<>();
	private Object name;

	public Collection<VirtualPet> pets() {
		return vPets.values();

	}

	public void add(VirtualPet pet) {
		vPets.put(pet.getName(), pet);
	}

	public VirtualPet getPet(String petName) {
		return vPets.get(petName);

	}

	// get the name of a individual pet
	public void takeIn(VirtualPet virtualPet) {
		String newName = virtualPet.getName();
		vPets.put(newName, virtualPet);
	}

	// feeding ALL pets
	public void waterAll() {
		for (VirtualPet pet : vPets.values()) {
			pet.waterPet();
		}
	}

	// watering ALL pets
	public void feedAll() {
		for (VirtualPet pet : vPets.values()) {
			pet.feedPet();
		}
	}

	public void play(String name) {
		vPets.get(name).playPet();
	}

	public void tickPets() {
		for (VirtualPet pet : vPets.values())
			;
	}

	public boolean adopt(String name) {
		vPets.remove(name);
		return false;
	}

	public boolean doesPetStay(String name) {
		return vPets.containsKey(name);
	}

	public String petStatus() {
		String petStatus = "";
		for (Entry<String, VirtualPet> eachPet : vPets.entrySet()) {
			petStatus += eachPet.getValue().getName() + "\t   " + eachPet.getValue().getFoodLevel() + "\t   "
					+ eachPet.getValue().getThristLevel() + "\t   " + eachPet.getValue().getBordemLevel() + "\n";
		}
		return petStatus;

	}

	public String showAllPets() {
		String showAllPets = "";
		for (Entry<String, VirtualPet> eachPet : vPets.entrySet()) {
			showAllPets += "Name: " + eachPet.getValue().getName() + "\t" + eachPet.getValue().getDescription() + "\n";
		}
		return showAllPets;

	}
}

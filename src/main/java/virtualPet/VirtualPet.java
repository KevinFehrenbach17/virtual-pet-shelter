package virtualPet;

public class VirtualPet {

	private String name;
	private String description;
	private int foodLevel;
	private int thirstLevel;
	private int bordemLevel;

	public VirtualPet(String petName, String petDescription) {
		this(petName, petDescription, 50, 50, 50);
	}

//	public VirtualPet(String newPetName, String newPetDescription) {

//	}

	public VirtualPet(String name, String description, int foodLevel, int thirstLevel, int bordemLevel) {
		this.name = name;
		this.description = description;
		this.foodLevel = foodLevel;
		this.thirstLevel = thirstLevel;
		this.bordemLevel = bordemLevel;
	}

	public String getName() {

		return name;
	}

	public String getDescription() {

		return description;
	}

	public int getFoodLevel() {

		return foodLevel;
	}

	public int getThristLevel() {

		return thirstLevel;
	}

	public int getBordemLevel() {

		return bordemLevel;
	}

	public void feedPet() {
		this.foodLevel += 2;
		this.thirstLevel -= 2;
	}

	public void waterPet() {
		this.thirstLevel += 4;
	}

	public void playPet() {
		this.bordemLevel += 4;
	}

	public void tick() {
		this.foodLevel--;
		this.thirstLevel--;
		this.bordemLevel--;

	}

}

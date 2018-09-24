package virtualPet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import virtualPet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldHaveName() {
		VirtualPet underTest = new VirtualPet("name", "");

		String petName = underTest.name;

		assertEquals("name", petName);

	}

	@Test
	public void shouldGetName() {
		VirtualPet underTest = new VirtualPet("name", "");

		String petName = underTest.getName();

		assertEquals("name", petName);
	}

	@Test
	public void shouldHaveDescription() {
		VirtualPet underTest = new VirtualPet("description", "");

		String petDescription = underTest.petDescription();

		assertEquals("description", petDescription);
	}

	@Test
	public void shouldGetDescription() {
		VirtualPet underTest = new VirtualPet("description", "");

		String petDescription = underTest.getDescription();

		assertEquals("description", petDescription);
	}

	@Test
	public void shouldHaveFoodLevel() {

		VirtualPet underTest = new VirtualPet(0, 0, 0);
		int foodLevel = underTest.getFoodLevel();
		assertEquals(2, foodLevel);
	}

	@Test
	public void shouldHaveThirstLevel() {

		VirtualPet underTest = new VirtualPet(0, 0, 0);
		int thirstLevel = underTest.getThristLevel();
		assertEquals(2, thirstLevel);
	}

	@Test
	public void shouldHaveBordemLevel() {

		VirtualPet underTest = new VirtualPet(0, 0, 0);
		int bordemLevel = underTest.getBordemLevel();
		assertEquals(2, bordemLevel);
	}

}

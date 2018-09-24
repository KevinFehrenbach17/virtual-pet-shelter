package virtualPet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.assertj.core.internal.Maps;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

public class ShelterTest {

//    @Test
//    public void shouldAddItem() {
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        
//        VirtualPet tests = new VirtualPet( tests, tests, 0, 0, 0);
//        VirtualPet test = new VirtualPet( tests, test, 0, 0, 0);
//        
//
//        underTest.plusPet(tests, tests, 0, 0, 0);
//
//        boolean shoesAreInCart = underTest.containsItem(tests,tests,0,0,0);
//        assertEquals("should have added item", true, shoesAreInCart);
//    }

	@Test
	public void shouldRemoveItem() {
		VirtualPetShelter underTest = new VirtualPetShelter();
		VirtualPet test = new VirtualPet(null, null, 0, 0, 0);
		underTest.plusPet(test, test, 1, 0, 0);
		underTest.adoptPet(test, test, 0, 0, 0);

		assertEquals("should have removed item", false, underTest.containsPet(test, test, 0, 0, 0));
	}

}

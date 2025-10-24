package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mainTest {

	@Test
	void testCalculateAverageOfThree() {
		var main= new main();
		assertEquals(17,main.calculateAverageOfThree(8, 3, 40));
		//fail("Not yet implemented");
	}

	@Test
	void testGetFactorial() {
		var main= new main();
		assertEquals(24,main.getFactorial(4));
		//fail("Not yet implemented");
	}

}

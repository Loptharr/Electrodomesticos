package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WashingMachineTest {

	@Test
	void test_finalPrice() {
		WashingMachine w = new WashingMachine(); 
		assertEquals(w._finalPrice(), 100020);
	}

}

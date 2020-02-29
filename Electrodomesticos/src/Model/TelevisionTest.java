package Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelevisionTest {

	@Test
	void test_checkConsumption() {
		Television t = new Television(); 
		assertEquals(t._checkConsumption(Consumption._F), true);
	}

	@Test
	void test_checkColor() {
		Television t = new Television(); 
		assertEquals(t._checkColor(Color._WHITE), true);
	}
	
	@Test
	void test_finalPrice() {
		Television t = new Television(); 
		assertEquals(t._finalPrice(), 100020);
	}

}

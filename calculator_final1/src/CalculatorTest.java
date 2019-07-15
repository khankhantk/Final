package calculator_final1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calcEngine = new Calculator();

	@Test
	void test() {
		fail("Not yet implemented");
	}


    @Test
    public void testEqual() 
    		throws Exception {
        assertEquals(calcEngine.findMax(3, 2, 5), 20.0);
    }

}

//becouse of short  time

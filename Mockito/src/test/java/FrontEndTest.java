import static org.junit.Assert.*;

import org.junit.Test;

public class FrontEndTest {

	@Test
	public void test() {
		assertTrue("Debería saler verdadero el número",FrontEnd.isNumeric("1"));
                assertFalse("Debería saler falso",FrontEnd.isNumeric("A"));
                assertTrue("Debería saler verdadero el número",FrontEnd.isInRange(1,0,4));
                assertFalse("Debería saler falso",FrontEnd.isInRange(5,0,4));
                
	}

}

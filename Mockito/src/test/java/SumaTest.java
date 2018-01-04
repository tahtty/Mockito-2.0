import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumaTest {

	Suma tester= new Suma();
	
	//haremos prueba por nodos
	@Test 
	public void testSum(){
	    assertEquals("Sumar with a=5 and b=3 must be 8", 8, tester.sumar(5,3));
	}
	
}

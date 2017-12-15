import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicacionTest {

	@Test
	  public void testMultiply() {
	    Multiplicacion tester = new Multiplicacion();
	    assertEquals("Multiplicar with multiplicador=0 and multiplicando=-2 must be 0", 0, tester.multiplicar(-2,0));
	    assertEquals("Multiplicar with multiplicador=-5 and multiplicando=-2 must be 10", 10, tester.multiplicar(-2,-5));
	  }

}

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class MultiplicacionTest {
	
	Multiplicacion tester = new Multiplicacion();
	
	@Before
	public void setup() {
		OperacionSuma suma =mock(OperacionSuma.class);
		OperacionResta rest = mock(OperacionResta.class);
		when(suma.sumar(0, -5)).thenReturn(-5);
		when(rest.restar(0, -1)).thenReturn(1);
		when(rest.restar(0, -5)).thenReturn(5);
		tester.setSuma(suma);
        tester.setResta(rest);
	}

	@Test//Prueba por nodos
	  public void testMultiply() {
	    
	    assertEquals("Multiplicar with multiplicador=-1 and multiplicando=-5 must be 5", 5, tester.multiplicar(-5,-1));
	  }

}

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class FrontEndTest {
	
	
	@Before
	public void setup() {
		OperacionSuma suma =mock(OperacionSuma.class);
		OperacionResta rest = mock(OperacionResta.class);
		OperacionMultiplicacion multi =mock(OperacionMultiplicacion.class);
		when(suma.sumar(3, 3)).thenReturn(6);
		when(rest.restar(3, 3)).thenReturn(0);
		when(multi.multiplicar(3, 3)).thenReturn(9);
		FrontEnd.setSuma(suma);
        FrontEnd.setResta(rest);
        FrontEnd.setMultiplicacion(multi);
	}
	@Test
	public void test() {
		assertTrue("Deber�a saler verdadero el n�mero",FrontEnd.isNumeric("1"));
        assertFalse("Deber�a saler falso",FrontEnd.isNumeric("A"));
        assertTrue("Deber�a saler verdadero el n�mero",FrontEnd.isInRange(1,0,4));
        assertFalse("Deber�a saler falso",FrontEnd.isInRange(5,0,4));
        assertFalse("Deber�a saler falso",FrontEnd.isInRange(0,0,4));
        assertEquals("Deber�a ser 6",6,FrontEnd.calcular(1, 3, 3));
        assertEquals("Deber�a ser 9",9,FrontEnd.calcular(2, 3, 3));
        assertEquals("Deber�a ser 0",0,FrontEnd.calcular(3, 3, 3));
	}

}

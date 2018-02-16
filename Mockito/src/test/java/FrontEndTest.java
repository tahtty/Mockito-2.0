import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
public class FrontEndTest {
	
	
	@Before
	public void setup() {
		Suma suma = new Suma();
		Resta rest = new Resta();
		Multiplicacion multi =new Multiplicacion();
		OperacionDivision divi = mock(OperacionDivision.class);
		when(divi.dividir(3, 3)).thenReturn("1/0");
		rest.setSuma(suma);
		multi.setSuma(suma);
		multi.setResta(rest);
		
		
		FrontEnd.setSuma(suma);
        FrontEnd.setResta(rest);
        FrontEnd.setMultiplicacion(multi);
        FrontEnd.setDivision(divi);
	}
	@Test
	public void test() {
		assertTrue("Deber�a saler verdadero el n�mero",FrontEnd.isNumeric("1"));
        assertFalse("Deber�a saler falso",FrontEnd.isNumeric("A"));
        assertTrue("Deber�a saler verdadero el n�mero",FrontEnd.isInRange(1,0,4));
        assertFalse("Deber�a saler falso",FrontEnd.isInRange(5,0,4));
        assertFalse("Deber�a saler falso",FrontEnd.isInRange(0,0,4));
        assertEquals("Deber�a ser 6","6",FrontEnd.calcular(1, 3, 3));
        assertEquals("Deber�a ser 9","5",FrontEnd.calcular(2, -5, -1));
        assertEquals("Deber�a ser 0","0",FrontEnd.calcular(3, 3, 3));
        assertEquals("Deber�a ser 1/0","1/0",FrontEnd.calcular(4, 3, 3));
	}

}
	
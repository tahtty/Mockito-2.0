import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RestaTest {
	Resta tester= new Resta();
	@Before
	public void setup() {
		OperacionSuma suma =mock(OperacionSuma.class);
		when(suma.sumar(5,-1)).thenReturn(4);
		tester.setSuma(suma);
	}
	@Test
	public void test() {
		assertEquals("El numero debe ser 4",4,tester.restar(5, 1));
	}
}

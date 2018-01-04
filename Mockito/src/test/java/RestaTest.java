import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RestaTest {
	Resta tester= new Resta();
	@Before
	public void setup() {
		Suma suma = new Suma();
		tester.setSuma(suma);
	}
	@Test
	public void test() {
		assertEquals("El numero debe ser 4",4,tester.restar(5, 1));
	}
}

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DivisionTest {
	Division tester= new Division();
	
	@Test
	public void test() {
		
		assertEquals("El resultado debe ser 1/0","1/0",tester.dividir(3, 3));
		assertEquals("El resultado debe ser -1","-1",tester.dividir(3, 0));
	}
}

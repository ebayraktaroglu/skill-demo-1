import org.junit.*;
import static org.junit.Assert.*;

public class Tester{
	@Test
	public void test(){
		assertEquals(8, Multiplication.multiply(2,4));
	}
}
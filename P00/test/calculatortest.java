import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculatortest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		calculator cal = new calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}

	
	public void testsubtract() {
		int a = 4321;
		int b = 1234;
			
		calculator cal = new calculator();
		int actual = cal.substract(a, b); 
			 
		int expected = 3087;
		assertEquals (expected, actual);
		}
	
	public void testmultiply() {
		int a = 2;
		int b = 4;
		
		calculator cal = new calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 8;
		assertEquals (expected,actual);
	}
	
	public void testdivide() {
		int a = 4;
		int b = 2;
		
		calculator cal = new calculator();
		int actual = cal.divide(a, b);
		
		int expected = 2;
		assertEquals (expected,actual);
	}



}

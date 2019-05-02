package Calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private Calculator cal;

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalConstructor() {
		Calculator cal2 = new Calculator("1+1");
	}
	@Test
	public void testPrepare() {
		assertEquals(cal.drive("1+1").run(), "2.0");
		assertEquals(cal.drive("cos(0)+1").run(), "2.0");
		assertEquals(cal.drive("cos0+1").run(), "error");
		assertEquals(cal.drive("2[10+1").run(), "error");
	}
}

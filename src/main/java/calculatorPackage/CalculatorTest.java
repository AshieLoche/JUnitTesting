package calculatorPackage;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

	private Calculator calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed once before any of the test methods in this class.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed once after all the test methods in this class.");
	}

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Executed before each test method in this class.");
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("Executed after each test method in this class.");
	}

	@Test
	public void testAdd() {
		int result = calculator.add(3, 4);
		assertEquals(7, result);
		System.out.println("Executed testAdd method.");
	}

	@Test
	public void testSubtract() {
		int result = calculator.subtract(10, 4);
		assertEquals(6, result);
		System.out.println("Executed testSubtract method.");
	}

	@Test
	public void testMultiply() {
		int result = calculator.multiply(2, 5);
		assertEquals(10, result);
		System.out.println("Executed testMultiply method.");
	}
	
	@Test
	public void testDivide() {
		int result = calculator.divide(20, 4);
		assertEquals(5, result);
		System.out.println("Executed testDivide method.");
	}

	@Test
	public void testDivideByZero() {
		assertThrows(ArithmeticException.class, () -> {
			calculator.divide(10, 0);
		});
		System.out.println("Executed testDivideByZero method.");
	}
}
package bankAccountPackage;

import org.junit.*;
import static org.junit.Assert.*;

public class BankAccountTest {

	private static BankAccount sharedAccount;
	private BankAccount account;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize a shared resource for the class
		sharedAccount = new BankAccount("12345", 1000.0);
		System.out.println("Executed once before any test methods in this class.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Clean up shared resource
		sharedAccount = null;
		System.out.println("Executed once after all test methods in this class.");
	}

	@Before
	public void setUp() throws Exception {
		// Initialize resources before each test
		account = new BankAccount("67890", 500.0);
		System.out.println("Executed before each test method in this class.");
	}

	@After
	public void tearDown() throws Exception {
		// Clean up resources after each test
		account = null;
		System.out.println("Executed after each test method in this class.");
	}

	@Test
	public void testDeposit() {
		double newBalance = account.deposit(200.0);
		assertEquals(700.0, newBalance, 0.001);
		System.out.println("Executed testDeposit method.");
	}

	@Test
	public void testWithdraw() {
		double newBalance = account.withdraw(100.0);
		assertEquals(400.0, newBalance, 0.001);
		System.out.println("Executed testWithdraw method.");
	}

	@Test
	public void testGetBalance() {
		double balance = account.getBalance();
		assertEquals(500.0, balance, 0.001);
		System.out.println("Executed testGetBalance method.");
	}

	@Test
	public void testSharedAccountDeposit() {
		double newBalance = sharedAccount.deposit(300.0);
		assertEquals(1300.0, newBalance, 0.001);
		System.out.println("Executed testSharedAccountDeposit method.");
	}

	@Test
	public void testSharedAccountWithdraw() {
		double newBalance = sharedAccount.withdraw(200.0);
		assertEquals(1100.0, newBalance, 0.001);
		System.out.println("Executed testSharedAccountWithdraw method.");
	}
}

package shoppingCartPackage;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShoppingCartTest {
	
	private static Product product1;
	private static Product product2;
	private static Product product3;
	private ShoppingCart shoppingCart;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Initialize a shared resource for the class
		product1 = new Product("Sprite", 67.0);
		product2 = new Product("Fries", 55.0);
		product3 = new Product("Mc Flurry", 110.0);
		System.out.println("Executed once before any test methods in this class.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Clean up shared resource
		product1 = null;
		product2 = null;
		product3 = null;
		System.out.println("Executed once after all test methods in this class.");
	}

	@Before
	public void setUp() throws Exception {
		// Initialize resources before each test
		shoppingCart = new ShoppingCart();
		System.out.println("Executed before each test method in this class.");
	}

	@After
	public void tearDown() throws Exception {
		// Clean up resources after each test
		shoppingCart = null;
		System.out.println("Executed after each test method in this class.");
	}

	@Test
	public void addProducts() {
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product3);
		shoppingCart.addProduct(product3);
		int productCount = shoppingCart.getProductCount();
		assertEquals(3, productCount);
		System.out.println("Executed addProducts method.");
	}

	@Test
	public void removeProducts() {
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product3);
		shoppingCart.addProduct(product3);
		shoppingCart.removeProduct(product3);
		int productCount = shoppingCart.getProductCount();
		assertEquals(2, productCount);
		System.out.println("Executed removeProducts method.");
	}

	@Test
	public void getTotalPrices() {
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product3);
		shoppingCart.addProduct(product3);
		shoppingCart.removeProduct(product3);
		shoppingCart.addProduct(product2);
		double totalPrice = shoppingCart.getTotalPrice();
		assertEquals(232.0, totalPrice, 0.001);
		System.out.println("Executed getTotalPrices method.");
	}

	@Test
	public void clearCarts() {
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product3);
		shoppingCart.addProduct(product3);
		shoppingCart.removeProduct(product3);
		shoppingCart.addProduct(product2);
		shoppingCart.clearCart();
		int productCount = shoppingCart.getProductCount();
		assertEquals(0, productCount);
		System.out.println("Executed clearCarts method.");
	}
	
}

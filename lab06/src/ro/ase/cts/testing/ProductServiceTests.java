package ro.ase.cts.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.models.Product;
import ro.ase.cts.services.ProductService;

public class ProductServiceTests {
	private ProductService serviceWithFake;
	private ProductService serviceWithStub;
	private DatabaseAdaptorMock mock;
	@Before
	public void initialize() {
		ProductRepositoryFake fake = new ProductRepositoryFake();
		ProductRepositoryStub stub = new ProductRepositoryStub();
		this.serviceWithFake = new ProductService(fake);
		this.serviceWithStub = new ProductService(stub);
		this.mock = new DatabaseAdaptorMock();
	}
	
	@Test
	public void testExistenceForProductFiltering() {
		List<Product> result = this.serviceWithFake.filterProducts(new Product("ASUS", "LAPTOP", 3000));
		assertNotNull(result);
	}
	
	@Test
	public void testRightForProductFiltering() {
		List<Product> result = this.serviceWithStub.filterProducts(new Product("Test", "Smartphone", 5000));
		double sum = 0;
		for(Product p : result) {
			sum += p.getPrice();
		}
		assertEquals(5000, sum, 0.1);
	}
	
	@Test
	@Category(ImportantTest.class)
	public void testMockProductFiltering() {
		List<Product> result = this.serviceWithStub.filterProducts(new Product("Test", "Smartphone", 5000));
		this.mock.setConnection(false);
		assertFalse(this.mock.close());
	}
}

package ro.ase.cts.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ro.ase.cts.interfaces.CRUDRepository;
import ro.ase.cts.interfaces.Database;
import ro.ase.cts.models.Product;

public class ProductRepositoryFake implements CRUDRepository<Product>{
	private Database database;
	private static List<Product> products;
	
	static {
		products = new ArrayList<Product>();
		products.add(new Product("ASUS ROG", "LAPTOP", 5000));
		products.add(new Product("ASUS Zenbook", "LAPTOP", 7000));
		products.add(new Product("Samsung S20", "SMARTPHONE", 4500));
		products.add(new Product("Samsung S20", "SMARTPHONE", 4500));
		products.add(new Product("Samsung S20", "SMARTPHONE", 4500));
	}
	
	@Override
	public List<Product> read(Product obj) {
		// TODO Auto-generated method stub
		List<Product> result = products.stream().filter(p -> p.getProductName().contains(obj.getProductName())).collect(Collectors.toList());
		return result;
	}

}

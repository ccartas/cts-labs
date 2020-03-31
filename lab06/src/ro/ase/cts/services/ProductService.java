package ro.ase.cts.services;

import java.util.List;

import ro.ase.cts.interfaces.CRUDRepository;
import ro.ase.cts.models.Product;

public class ProductService {
	private final CRUDRepository repository;
	
	public ProductService(CRUDRepository repository) {
		this.repository = repository;
	}
	
	public List<Product> filterProducts(Product p) {
		return this.repository.read(p);
	}
}

package ro.ase.cts.testing;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.interfaces.CRUDRepository;
import ro.ase.cts.models.Product;

public class ProductRepositoryStub implements CRUDRepository<Product>{

	@Override
	public List<Product> read(Product obj) {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		products.add(obj);
		return products;
	}

}

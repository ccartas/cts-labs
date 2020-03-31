package ro.ase.cts.repository;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.interfaces.CRUDRepository;
import ro.ase.cts.interfaces.Database;
import ro.ase.cts.models.Product;

public class ProductRepository implements CRUDRepository<Product>{
	private Database adaptor;
	
	@Override
	public List<Product> read(Product obj) {
		// TODO Auto-generated method stub
		List<Product> p = new ArrayList<Product>();
		return p;
	}

}

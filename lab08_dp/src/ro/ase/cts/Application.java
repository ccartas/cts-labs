package ro.ase.cts;

import ro.ase.cts.interfaces.Sellable;
import ro.ase.cts.models.Laptop;
import ro.ase.cts.models.User;
import ro.ase.cts.services.ServiceA;
import ro.ase.cts.services.ServiceB;
import ro.ase.cts.utils.ProductFactory;
import ro.ase.cts.utils.ProductType;
import ro.ase.cts.utils.ServerCache;

public class Application {
	
	public static void main(String[] args) {
		ServiceA serviceA = new ServiceA();
		ServiceB serviceB = new ServiceB();
		
		serviceA.call("http://localhost:8090/api/users");
		serviceB.call("http://localhost:8090/api/products");
		
		ServerCache cache = ServerCache.getInstance();
		
		System.out.println(cache.get("serviceA"));
		System.out.println(cache.get("serviceB"));
		
		User u = new User.UserBuilder("John", "Doe", "test", "p@ss")
					.withPhoneNumber("123456789")
					.withYearOfBirth(1997)
					.withGender("M")
					.withProfileCompleted(true)
					.build();
		
		ProductFactory factory = new ProductFactory();
		Sellable l = factory.getProduct(ProductType.LAPTOP, 3000);
		l.sell();
		
		Sellable s =  factory.getProduct(ProductType.SMARTPHONE, 2000);
		s.sell();
		
		
	}
}

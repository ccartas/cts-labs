package ro.ase.cts;

import ro.ase.cts.models.Laptop;
import ro.ase.cts.models.Smartphone;
import ro.ase.cts.models.User;
import ro.ase.cts.services.ServiceA;
import ro.ase.cts.services.ServiceB;
import ro.ase.cts.utils.ServerCache;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceA serviceA = new ServiceA();
		ServiceB serviceB = new ServiceB();
		
		serviceA.call("http://localhost:8090/api/users");
		serviceB.call("http://localhost:8090/api/products");
		
		ServerCache cache = new ServerCache();
		
		System.out.println(cache.get("serviceA"));
		System.out.println(cache.get("serviceB"));
		
		
		User u = new User("admin", "p@ss", "John", "Doe", "123456789", 1996, "M", true);  
		
		
		Laptop laptop = new Laptop(3000);
		Smartphone smartphone = new Smartphone(2000);
		laptop.sell();
		smartphone.sell();
	}

}

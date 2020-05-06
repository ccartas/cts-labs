package ro.ase.cts.utils;

import ro.ase.cts.models.HttpRequest;


public class OrderController {
	
	public OrderController() {
		
	}
	
	public void addOrder(HttpRequest request) throws Exception {
		if(request.getHeaders().get("Content-Type") == null) throw new Exception();
		if(request.getHeaders().get("Content-Type").equals("application/json")) {
			System.out.println("Request headers are valid.");
		} else {
			throw new Exception();
		}
		
	}
}
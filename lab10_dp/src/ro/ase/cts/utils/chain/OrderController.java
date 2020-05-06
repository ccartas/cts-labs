package ro.ase.cts.utils.chain;

import ro.ase.cts.exceptions.FilterException;
import ro.ase.cts.models.HttpRequest;

public class OrderController {
	private AbstractFilter filter; 
	
	public OrderController() {
		AuthorizationFilter authorizationFilter = new AuthorizationFilter();
		AuthenticationFilter authenticationFilter = new AuthenticationFilter();
		authenticationFilter.setNextFilter(authorizationFilter);
		this.filter = new ContentTypeFilter();
		this.filter.setNextFilter(authenticationFilter);
	}
	
	public void addOrder(HttpRequest request) {
		try {
			this.filter.doFilter(request);
			System.out.println("Request headers are valid.");
		} catch (FilterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

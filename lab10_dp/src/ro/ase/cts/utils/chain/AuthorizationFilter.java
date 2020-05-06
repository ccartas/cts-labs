package ro.ase.cts.utils.chain;

import ro.ase.cts.exceptions.FilterException;
import ro.ase.cts.models.HttpRequest;

public class AuthorizationFilter extends AbstractFilter {

	@Override
	public void doFilter(HttpRequest request) throws FilterException {
		if(checkRoles(request)) {
			if(this.next != null) {
				this.next.doFilter(request);
			}
		} else {
			throw new FilterException("Invalid Authorization header");
		}
	}
	
	public boolean checkRoles(HttpRequest request) {
		if(request.getHeaders().get("Authorization") == null) return false;
		if(request.getHeaders().get("Authorization").equals("CLIENT")) {
			return true;
		} else {
			return false;
		}
	}

}

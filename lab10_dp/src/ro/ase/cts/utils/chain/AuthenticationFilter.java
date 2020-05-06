package ro.ase.cts.utils.chain;

import ro.ase.cts.exceptions.FilterException;
import ro.ase.cts.models.HttpRequest;

public class AuthenticationFilter extends AbstractFilter {

	@Override
	public void doFilter(HttpRequest request) throws FilterException {
		if(checkSSOHeader(request)) {
			if(this.next != null) {
				this.next.doFilter(request);
			}
		} else {
			throw new FilterException("Invalid Single Sing On Header");
		}
	}
	
	private boolean checkSSOHeader(HttpRequest request) {
		if(request.getHeaders().get("SSO_HEADER") == null) return false;
		if(request.getHeaders().get("SSO_HEADER").equals("SECRET_SSO_APP")) {
			return true;
		} else {
			return false;
		}
	}

}

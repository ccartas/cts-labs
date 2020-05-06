package ro.ase.cts.utils.chain;

import ro.ase.cts.exceptions.FilterException;
import ro.ase.cts.models.HttpRequest;

public class ContentTypeFilter extends AbstractFilter {
	
	@Override
	public void doFilter(HttpRequest request) throws FilterException {
		if(this.checkContentType(request)) {
			if(this.next != null) {
				this.next.doFilter(request);
			}
		} else {
			throw new FilterException("Invalid Content-Type");
		}
	}
	
	public boolean checkContentType(HttpRequest request) {
		if(request.getHeaders().get("Content-Type") == null) return false;
		if(request.getHeaders().get("Content-Type").equals("application/json")) {
			return true;
		} else {
			return false;
		}
	}

}

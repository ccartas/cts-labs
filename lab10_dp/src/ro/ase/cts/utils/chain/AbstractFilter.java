package ro.ase.cts.utils.chain;

import ro.ase.cts.exceptions.FilterException;
import ro.ase.cts.models.HttpRequest;

public abstract class AbstractFilter {
	protected AbstractFilter next;
	
	public void setNextFilter(AbstractFilter filter) {
		this.next = filter;
	}
	
	public abstract void doFilter(HttpRequest request) throws FilterException;
}

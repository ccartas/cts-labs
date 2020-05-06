package ro.ase.cts.models;

public class HttpRequest {
	private HttpHeaders headers;
	private Order order;
	
	public HttpRequest(HttpHeaders headers, Order order) {
		this.headers = headers;
		this.order = order;
	}
	
	public HttpHeaders getHeaders() {
		return this.headers;
	}
	
	public Order getOrder() {
		return this.order;
	}
}

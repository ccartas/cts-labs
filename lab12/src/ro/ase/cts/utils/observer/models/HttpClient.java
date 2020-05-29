package ro.ase.cts.utils.observer.models;

// Observabil Concret
public class HttpClient extends Observable {
	private String response; //Stare
	
	
	//modificaStare
	public void setResponse(String response) {
		this.response = response;
	}
	
	//generareEveniment
	public void get(String url, String option) {
		this.setResponse(String.format("200 OK %s", url));
		System.out.println(String.format("Response is %s", this.response));
		this.notifySubscribers();
	}
}

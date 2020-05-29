package ro.ase.cts.utils.observer;

import ro.ase.cts.utils.observer.models.HttpClient;
import ro.ase.cts.utils.observer.models.UserObserver;

public class Application {
	public static void main(String[] args) {
		HttpClient httpClient = new HttpClient();
		
		UserObserver userObserver = new UserObserver();
		httpClient.subscribe(userObserver);
		httpClient.get("http://localhost:8999/users", null);
		httpClient.unsubscribe(userObserver);
	}
}

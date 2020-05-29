package ro.ase.cts.utils.observer.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.utils.observer.interfaces.Observer;

public abstract class Observable {
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void subscribe(Observer observer) {
		this.observers.add(observer);
	}
	
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifySubscribers() {
		for(Observer o : this.observers) {
			o.handle();
		}
	}
}

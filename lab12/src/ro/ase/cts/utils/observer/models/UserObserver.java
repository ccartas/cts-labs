package ro.ase.cts.utils.observer.models;

import ro.ase.cts.utils.observer.interfaces.Observer;

public class UserObserver implements Observer {

	@Override
	public void handle() {
		System.out.println("Execut logica specifica gestionarii utilizatorilor");
	}
	
}

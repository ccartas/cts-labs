package ro.ase.cts.utils.strategy.models;

import ro.ase.cts.utils.strategy.interfaces.ApplicationTheme;

// Strategie A
public class DarkTheme implements ApplicationTheme {

	// algoritm(): void
	@Override
	public void applyTheme() {
		System.out.println("Application has dark theme. Power saving!");
	}

}

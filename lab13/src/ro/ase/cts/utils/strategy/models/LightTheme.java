package ro.ase.cts.utils.strategy.models;

import ro.ase.cts.utils.strategy.interfaces.ApplicationTheme;

// Strategie B
public class LightTheme implements ApplicationTheme {
	
	
	// algoritm(): void
	@Override
	public void applyTheme() {
		System.out.println("Application has light theme.");
	}

}

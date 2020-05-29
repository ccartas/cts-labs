package ro.ase.cts.utils.strategy.models;

import ro.ase.cts.utils.strategy.interfaces.ApplicationTheme;

// Context / Obiect
public class ApplicationManager {
	private ApplicationTheme theme; // strategie
	
	// setStrategie(strategie: Strategie): void
	public void setTheme(ApplicationTheme theme) {
		this.theme = theme;
	}
	
	// operatie(): void
	public void changeTheme() {
		this.theme.applyTheme();
	}
}

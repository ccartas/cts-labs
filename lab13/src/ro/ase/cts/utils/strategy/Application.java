package ro.ase.cts.utils.strategy;

import ro.ase.cts.utils.strategy.interfaces.ApplicationTheme;
import ro.ase.cts.utils.strategy.models.ApplicationManager;
import ro.ase.cts.utils.strategy.models.DarkTheme;
import ro.ase.cts.utils.strategy.models.LightTheme;

public class Application {

	public static void main(String[] args) {
		ApplicationTheme lightTheme = new LightTheme();
		ApplicationTheme darkTheme = new DarkTheme();
		
		ApplicationManager manager = new ApplicationManager();
		
		manager.setTheme(lightTheme);
		manager.changeTheme();
		
		manager.setTheme(darkTheme);
		manager.changeTheme();
	}

}

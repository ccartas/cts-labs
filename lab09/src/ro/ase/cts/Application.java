package ro.ase.cts;

import ro.ase.cts.model.SmartHome;
import ro.ase.cts.model.SmartHomeUIPanel;
import ro.ase.cts.model.UITheme;

public class Application {
	public static void main(String[] args) {
		SmartHome sh = new SmartHome("Calea Dorobanti");
		sh.setIsSunnyDay(false);
		sh.setTemperature(30);
		sh.setIsKnownFace(true);
		
		sh.startAirService();
		sh.openDoor();
		sh.openWindows();
		
		SmartHomeUIPanel panel1 = new SmartHomeUIPanel();
		SmartHomeUIPanel panel2 = new SmartHomeUIPanel();
		SmartHomeUIPanel panel3 = new SmartHomeUIPanel();
		
		panel1.setTheme(UITheme.DRACULA);
	}
}

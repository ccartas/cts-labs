package ro.ase.cts;

import ro.ase.cts.external.ExternalSmartHomeFacade;
import ro.ase.cts.model.NewSmartHome;
import ro.ase.cts.model.SmartHome;
import ro.ase.cts.model.SmartHomeUIPanel;
import ro.ase.cts.model.UITheme;
import ro.ase.cts.utils.ExternalSmartHomeAdapter;
import ro.ase.cts.utils.SmartHomeAdapter;
import ro.ase.cts.utils.SmartHomeFacade;

public class Application {
	public static void main(String[] args) {
		System.out.println("-----ADAPTER OUTPUT-----");
		ExternalSmartHomeFacade externalFacade = new ExternalSmartHomeFacade();
		NewSmartHome newSmartHome = new NewSmartHome("Calea Victoriei", externalFacade);
		newSmartHome.startAllSystems();
		
		// adaptor clasa veche la clasa noua
		SmartHomeFacade oldFacade = new SmartHomeFacade();
		oldFacade.setIsKnownFace(false);
		oldFacade.setIsSunnyDay(true);
		oldFacade.setTemperature(31);
		SmartHomeAdapter adapter = new SmartHomeAdapter(oldFacade);
		NewSmartHome nsh = new NewSmartHome("Bd. Unirii", adapter);
		nsh.startAllSystems();
		
		// adaptor clasa noua la clasa veche
		ExternalSmartHomeAdapter externalAdapter = new ExternalSmartHomeAdapter(externalFacade);
		SmartHome sh1 = new SmartHome("Calea Dorobanti", externalAdapter);
		sh1.startSystems();
		
		System.out.println("-----FACADE OUTPUT-----");
		SmartHomeFacade facade = new SmartHomeFacade();
		facade.setIsKnownFace(true);
		facade.setTemperature(14);
		facade.setIsSunnyDay(false);
		SmartHome sh = new SmartHome("Calea Dorobanti", facade);
		sh.startSystems();
		
		System.out.println("-----PROTOTYPE OUTPUT-----");
		SmartHomeUIPanel panel1 = new SmartHomeUIPanel();
		SmartHomeUIPanel panel2 = new SmartHomeUIPanel();
		SmartHomeUIPanel panel3 = new SmartHomeUIPanel();
		
		try {
			SmartHomeUIPanel panel4 = (SmartHomeUIPanel) panel1.clone();
			SmartHomeUIPanel panel5 = (SmartHomeUIPanel) panel1.copy();
			panel4.setTheme(UITheme.DRACULA);
			panel5.setTheme(UITheme.DRACULA);
			panel5.features.put("door", true);
			System.out.println(panel5.features.get("door"));
			System.out.println(panel4.features.get("door"));
			System.out.println(panel2.features.get("door"));
			System.out.println("New objects have the same reference: "+(panel4 == panel5));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		panel1.setTheme(UITheme.DRACULA);
	}
}

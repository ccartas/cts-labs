package ro.ase.cts.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ro.ase.cts.interfaces.AbstractSmartHomeUIPanelPrototype;

public class SmartHomeUIPanel implements AbstractSmartHomeUIPanelPrototype, Cloneable {
	public Map<String, Boolean> features;
	private UITheme theme;
	
	public SmartHomeUIPanel() {
		this.theme = UITheme.LIGHT;
		this.features = new HashMap<String, Boolean>();
		this.features.put("door", false);
		this.features.put("window", false);
		this.features.put("air", false);
	}
	
	public void setTheme(UITheme theme) {
		this.theme = theme;
	}

	@Override
	public AbstractSmartHomeUIPanelPrototype copy() throws CloneNotSupportedException {
		AbstractSmartHomeUIPanelPrototype prototype = (SmartHomeUIPanel) super.clone();
		return prototype;
	}
	
	@Override
	public AbstractSmartHomeUIPanelPrototype clone() throws CloneNotSupportedException {
		AbstractSmartHomeUIPanelPrototype prototype = (SmartHomeUIPanel) super.clone();
		return prototype;
	}
	 
}

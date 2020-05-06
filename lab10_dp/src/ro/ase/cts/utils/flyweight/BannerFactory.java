package ro.ase.cts.utils.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BannerFactory {
	private Map<String, Banner> bannerCache;
	
	public BannerFactory() {
		this.bannerCache = new HashMap<String, Banner>();
	}
	
	public Banner getBanner(String type) {
		Banner result = this.bannerCache.get(type);
		if(result == null) {
			switch(type) {
			case "SMALL":
				result = new SmallBanner();
				break;
			case "MEDIUM":
				result = new MediumBanner();
				break;
			}
			this.bannerCache.put(type, result);
		}
		return result;
	}
}

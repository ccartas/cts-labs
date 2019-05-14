package ro.ase.cts.service;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFacade {
	public List<SocialMediaService> smSources = new ArrayList<SocialMediaService>();
	
	
	public int totalNumberContent(String keyword) {
		int counter = 0;
		for(SocialMediaService smc : smSources) {
			counter+= smc.getSocialMediaContent(keyword);
		}
		return counter;
	}
}

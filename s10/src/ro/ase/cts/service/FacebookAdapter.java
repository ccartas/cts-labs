package ro.ase.cts.service;

import ro.ase.cts.external.service.FacebookAPI;

public class FacebookAdapter implements SocialMediaService{
	
	private FacebookAPI api;
	
	public FacebookAdapter(FacebookAPI api) {
		this.api = api;
	}
	
	@Override
	public int getSocialMediaContent(String keyword) {
		// TODO Auto-generated method stub
		return this.api.getNumberOfPostsByTags(keyword);
	}

}

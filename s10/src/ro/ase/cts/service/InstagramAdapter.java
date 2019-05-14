package ro.ase.cts.service;

import ro.ase.cts.external.service.InstagramAPI;

public class InstagramAdapter implements SocialMediaService{
	private InstagramAPI api;
	
	public InstagramAdapter(InstagramAPI api) {
		this.api = api;
	}

	@Override
	public int getSocialMediaContent(String keyword) {
		// TODO Auto-generated method stub
		return this.api.getNumberOfPostsByHashtag(keyword);
	}
	
	
}

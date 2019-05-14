package ro.ase.cts.service;

import ro.ase.cts.external.service.TwitterAPI;

public class TwitterAdapter implements SocialMediaService{
	private TwitterAPI api;
	
	public TwitterAdapter(TwitterAPI api) {
		this.api = api;
	}

	@Override
	public int getSocialMediaContent(String keyword) {
		// TODO Auto-generated method stub
		return this.api.getNumberOfTweetsByHashTag(keyword);
	}
	
	
}

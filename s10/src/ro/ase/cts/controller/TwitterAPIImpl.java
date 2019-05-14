package ro.ase.cts.controller;

import ro.ase.cts.external.service.TwitterAPI;

public class TwitterAPIImpl implements TwitterAPI{
	
	private static final String API_URL = "https://twitter.com/api/v1/";
	
	@Override
	public int getNumberOfTweetsByHashTag(String hashtag) {
		// TODO Auto-generated method stub
		System.out.println("Fake call to "+API_URL+"?hashtag="+hashtag);
		return 15;
	}

}

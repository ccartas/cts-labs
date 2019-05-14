package ro.ase.cts.controller;

import ro.ase.cts.external.service.FacebookAPI;

public class FacebookAPIImpl implements FacebookAPI{
	private static final String API_URL = "https://facebook.com/api/v1/"; 
	@Override
	public int getNumberOfPostsByTags(String tag) {
		// TODO Auto-generated method stub
		System.out.println("Fake call to "+API_URL+"?tag="+tag);
		return 30;
	}
	
}

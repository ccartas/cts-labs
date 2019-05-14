package ro.ase.cts.controller;

import ro.ase.cts.external.service.InstagramAPI;

public class InstagramAPIImpl implements InstagramAPI{

	@Override
	public int getNumberOfPostsByHashtag(String hashtag) {
		// TODO Auto-generated method stub
		System.out.println("Fake call to: https://instagra.com/api/v1/hashtag?="+hashtag);
		return 20;
	}

}

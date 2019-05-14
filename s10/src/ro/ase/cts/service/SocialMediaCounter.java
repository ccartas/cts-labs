package ro.ase.cts.service;

public class SocialMediaCounter {
	private TwitterAdapter twAdapter;
	private InstagramAdapter igAdapter;
	private FacebookAdapter fbAdapter;
	
	public SocialMediaCounter(TwitterAdapter twAdapter, InstagramAdapter igAdapter, FacebookAdapter fbAdapter) {
		this.twAdapter = twAdapter;
		this.igAdapter = igAdapter;
		this.fbAdapter = fbAdapter;
	}
	
	
	public int getNumberOfSocialMediaPosts(String hashtag, String network) {
		switch(network){
			case "Twitter":
				return this.twAdapter.getSocialMediaContent(hashtag);
			case "Facebook":
				return this.fbAdapter.getSocialMediaContent(hashtag);
			case "Instagram":
				return this.igAdapter.getSocialMediaContent(hashtag);
			default:
				return 0;		
		}
	}

	
	
	
}

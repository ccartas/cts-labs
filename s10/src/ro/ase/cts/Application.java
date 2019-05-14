package ro.ase.cts;

import ro.ase.cts.controller.FacebookAPIImpl;
import ro.ase.cts.controller.InstagramAPIImpl;
import ro.ase.cts.controller.TwitterAPIImpl;
import ro.ase.cts.external.service.FacebookAPI;
import ro.ase.cts.external.service.InstagramAPI;
import ro.ase.cts.external.service.TwitterAPI;
import ro.ase.cts.models.Cappuccinno;
import ro.ase.cts.models.Coffee;
import ro.ase.cts.models.Decaf;
import ro.ase.cts.models.SourCream;
import ro.ase.cts.service.FacebookAdapter;
import ro.ase.cts.service.InstagramAdapter;
import ro.ase.cts.service.SocialMediaCounter;
import ro.ase.cts.service.TwitterAdapter;

public class Application {
	public static void main(String[] args) {
		Coffee coffee = new Cappuccinno();
		System.out.println(coffee.getDescription() + ": " + coffee.getPrice());
		coffee = new Decaf(coffee);
		System.out.println(coffee.getDescription() + ": " + coffee.getPrice());
		coffee = new SourCream(coffee);
		System.out.println(coffee.getDescription() + ": " + coffee.getPrice());
		
		
		FacebookAPI fbApi = new FacebookAPIImpl();
		TwitterAPI twApi = new TwitterAPIImpl();
		InstagramAPI igApi = new InstagramAPIImpl();
		
		System.out.println(fbApi.getNumberOfPostsByTags("#coffee"));
		System.out.println(twApi.getNumberOfTweetsByHashTag("#morning"));
		System.out.println(igApi.getNumberOfPostsByHashtag("#ineedcoffee"));
		
		FacebookAdapter fbAdapter = new FacebookAdapter(fbApi);
		TwitterAdapter twAdapter = new TwitterAdapter(twApi);
		InstagramAdapter igAdapter = new InstagramAdapter(igApi);
		
		SocialMediaCounter smc = new SocialMediaCounter(twAdapter, igAdapter, fbAdapter);
		
		smc.getNumberOfSocialMediaPosts("#coffee", "Facebook");
	}
}

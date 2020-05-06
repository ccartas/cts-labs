package ro.ase.cts.utils.flyweight;

public class MediumBanner implements Banner {
	private final double WIDTH;
	private final double HEIGHT;
	
	
	public MediumBanner() {
		WIDTH = 640;
		HEIGHT = 480;
	}
	
	
	@Override
	public void draw(BannerContext context) {
		System.out.println(String.format("Medium Banner is rendered on %s with the following source %s", context.getPosition(), context.getImageSource()));
	}

}

package ro.ase.cts.utils.flyweight;

public class SmallBanner implements Banner {
	public final double WIDTH;
	public final double HEIGHT;
	
	public SmallBanner() {
		WIDTH = 200;
		HEIGHT = 200;
	}

	@Override
	public void draw(BannerContext context) {
		System.out.println(String.format("Small Banner is rendered on %s with the following source %s", context.getPosition(), context.getImageSource()));
	}
}

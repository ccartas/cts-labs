package ro.ase.cts.utils.flyweight;

public class BannerContext {
	private String imageSource;
	private String position;
	
	public BannerContext(String imageSource, String position) {
		this.imageSource = imageSource;
		this.position = position;
	}
	
	public String getImageSource() {
		return this.imageSource;
	}
	
	public String getPosition() {
		return this.position;
	}	
	
}

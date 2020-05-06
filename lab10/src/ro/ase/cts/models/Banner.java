package ro.ase.cts.models;

public class Banner {
	private double width;
	private double height;
	private String imageSource;
	private String position;
	
	public Banner(double width, double height, String imageSource, String position) {
		this.width = width;
		this.height = height;
		this.imageSource = imageSource;
		this.position = position;
	}
}

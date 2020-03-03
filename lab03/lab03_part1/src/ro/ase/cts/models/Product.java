package ro.ase.cts.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import ro.ase.cts.interfaces.Upgradeable;

/**
 * SOLID:
 * 	- Single Responsability
 * 	- Open Closed
 * 	- Liskov Substitution
 * 	- Interface Segregation
 * 	- Dependency Inversion
 * @author cosmincartas
 *
 */
public class Product implements Upgradeable{
	private final int PRODUCT_ID;
	private String productName;
	private String category;
	private int productionYear;
	private double price;
	private List<Product> products;
	
	public Product(int productId) {
		this.PRODUCT_ID = productId;
		this.products = new ArrayList<Product>();
	}
	
	public Product(int productId, String productName, String category, int productionYear, double price) {
		this.PRODUCT_ID = productId;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.productionYear = productionYear;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProductName() {
		return this.productName;
	}
	public String getCategory() {
		return this.category;
	}
	public double getPrice() {
		return this.price;
	}
	public void addProductToCart(Product product) {
		this.products.add(product);
	}
	public void removeProductFromCart(Product product) {
		this.products.removeIf(p -> p.PRODUCT_ID == product.PRODUCT_ID);
	}

	@Override
	public void getBuyBackValueForSmartphone() {
		// TODO Auto-generated method stub
		Date d = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(d);
		int currentYear = calendar.get(Calendar.YEAR);
		int aging = currentYear - this.productionYear;
		if(aging <= 1) {
			System.out.println("Buy back value is " + this.price * 0.6);
		} else {
			System.out.println("Buy back value is " + this.price * 0.3);
		}
	}

	@Override
	public void getBuyBackValueForLaptop() {
		// TODO Auto-generated method stub
		
	}
}

package ro.ase.cts;

import ro.ase.cts.interfaces.DiscountNotification;
import ro.ase.cts.models.EmailNotification;
import ro.ase.cts.models.HttpHeaders;
import ro.ase.cts.models.HttpRequest;
import ro.ase.cts.models.Order;
import ro.ase.cts.models.PWANotification;
import ro.ase.cts.utils.chain.OrderController;
import ro.ase.cts.utils.decorator.EmailNotificationDecorator;
import ro.ase.cts.utils.decorator.PWANotificationDecorator;
import ro.ase.cts.utils.flyweight.Banner;
import ro.ase.cts.utils.flyweight.BannerContext;
import ro.ase.cts.utils.flyweight.BannerFactory;
import ro.ase.cts.utils.flyweight.MediumBanner;
import ro.ase.cts.utils.flyweight.SmallBanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("-----DECORATOR OUTPUT-----");
		DiscountNotification notification1 = new PWANotification("Discount", "Product on sale");
		DiscountNotification notification2 = new PWANotificationDecorator(new EmailNotificationDecorator(notification1));
		notification2.sendNotification();
		
		System.out.println("-----CHAIN OF RESPONSABILITY OUTPUT-----");
		Order o = new Order("john.doe", "Calea Dorobanti", "Calea Dorobanti", 2000);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("SSO_HEADER", "SECRET_SSO_APP");
		headers.set("Authorization", "CLIENT");
		
		HttpRequest request = new HttpRequest(headers, o);
		OrderController controller = new OrderController();
		controller.addOrder(request);
		
		System.out.println("-----FLYWEIGHT OUTPUT-----");
		
		BannerFactory factory = new BannerFactory();
		SmallBanner small = (SmallBanner) factory.getBanner("SMALL");
		MediumBanner medium = (MediumBanner) factory.getBanner("MEDIUM");
		BannerContext smallContext = new BannerContext("google.com/image.png", "TOP");
		BannerContext mediumContext = new BannerContext("google.com/image.png", "BOTTOM");
		small.draw(smallContext);
		medium.draw(mediumContext);
	}
}

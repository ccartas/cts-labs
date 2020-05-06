package ro.ase.cts;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.models.Banner;
import ro.ase.cts.models.EmailNotification;
import ro.ase.cts.models.HttpHeaders;
import ro.ase.cts.models.HttpRequest;
import ro.ase.cts.models.Order;
import ro.ase.cts.models.PWANotification;
import ro.ase.cts.utils.OrderController;

public class Application {
	public static void main(String[] args) {
		PWANotification notification = new PWANotification("Test", "Product discount");
		notification.sendNotification();
		EmailNotification notification1 = new EmailNotification("Test1", "Email product discount");
		notification1.sendNotification();
		
		
		Order o = new Order("john.doe", "Calea Dorobanti", "Calea Dorobanti", 2000);
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		HttpRequest request = new HttpRequest(headers, o);
		OrderController controller = new OrderController();
		try {
			controller.addOrder(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Banner> banners = new ArrayList<Banner>();
		for(int i = 0; i < 100; i++) {
			banners.add(new Banner(200, 200, "http://google.com/images/img.png", "TOP"));
		}
	}
}

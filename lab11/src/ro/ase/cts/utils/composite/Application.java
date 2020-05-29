package ro.ase.cts.utils.composite;

import ro.ase.cts.utils.composite.models.Div;
import ro.ase.cts.utils.composite.models.Header;
import ro.ase.cts.utils.composite.models.Paragraph;

public class Application {

	public static void main(String[] args) {
		Paragraph p1 = new Paragraph("Hello");
		Paragraph p2 = new Paragraph("Hi there");
		Header h1 = new Header("My application");
		
		System.out.println(p1.render());
		System.out.println(p2.render());
		System.out.println(h1.render());
		
		Div div1 = new Div(null);
		div1.addChild(h1);
		div1.addChild(p1);
		div1.addChild(p2);
		
		System.out.println(div1.render());
		
		Div div2 = new Div(null);
		div2.addChild(div1);
		System.out.println(div2.render());
	}

}

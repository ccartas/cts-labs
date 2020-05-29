package ro.ase.cts.utils.composite.models;

import ro.ase.cts.utils.composite.interfaces.HTMLElement;

//NodFrunza
public class Paragraph implements HTMLElement {
	private String content;
	
	public Paragraph(String content) {
		this.content = content;
	}
	
	
	//metodaSpecifica
	@Override
	public String render() {
		return String.format("<p>%s</p>", this.content);
	}

	@Override
	public void addChild(HTMLElement child) {
		throw new UnsupportedOperationException("addChild method should be called from composite classes only");
	}

	@Override
	public void removeChild(int index) {
		throw new UnsupportedOperationException("removeChild method should be called from composite classes only");
	}

	@Override
	public HTMLElement getChild(int index) {
		throw new UnsupportedOperationException("getChild method should be called from composite classes only");
	}
}

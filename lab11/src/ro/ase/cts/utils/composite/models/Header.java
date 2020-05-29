package ro.ase.cts.utils.composite.models;

import ro.ase.cts.utils.composite.interfaces.HTMLElement;

public class Header implements HTMLElement {
	private String content;
	
	public Header(String content) {
		this.content = content;
	}
	
	@Override
	public String render() {
		return String.format("<h1>%s</h1>", this.content);
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

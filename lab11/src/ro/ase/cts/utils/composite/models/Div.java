package ro.ase.cts.utils.composite.models;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.utils.composite.interfaces.HTMLElement;

// Composite
public class Div implements HTMLElement {
	private String content;
	private List<HTMLElement> children;
	
	public Div(String content) {
		this.content = content;
		this.children = new ArrayList<HTMLElement>();
	}
	@Override
	public String render() {
		StringBuilder builder = new StringBuilder();
		builder.append("<div> \n");
		if(this.content != null) builder.append(this.content + "\n");
		for(HTMLElement child : this.children) {
			builder.append("\t");
			builder.append(child.render());
			builder.append("\n");
		}
		builder.append("</div>");
		return builder.toString();
	}

	@Override
	public void addChild(HTMLElement child) {
		this.children.add(child);
	}

	@Override
	public void removeChild(int index) {
		this.children.remove(index);
	}

	@Override
	public HTMLElement getChild(int index) {
		return this.children.get(index);
	}

}

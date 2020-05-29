package ro.ase.cts.utils.composite.interfaces;

// ComponentaAbstracta
public interface HTMLElement {
	public String render(); // metoda specifica
	public void addChild(HTMLElement child); //adaugaNod
	public void removeChild(int index); //stergeNod
	public HTMLElement getChild(int index); //getNodCopil
}

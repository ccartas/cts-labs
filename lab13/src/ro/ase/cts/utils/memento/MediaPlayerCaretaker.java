package ro.ase.cts.utils.memento;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayerCaretaker {
	private List<MediaPlayerMemento> history = new ArrayList<MediaPlayerMemento>();
	
	public void addMemento(MediaPlayerMemento memento) {
		this.history.add(memento);
	}
	
	public MediaPlayerMemento getState() {
		if(this.history.size() > 0) {
			MediaPlayerMemento memento = this.history.get(this.history.size() - 1); // extrag ultima stare din istoric
			this.history.remove(this.history.size() - 1); // sterg ultima stare din istoric
			return memento;
		} else {
			return null;
		}
	}
}

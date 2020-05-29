package ro.ase.cts.utils.memento;

public class MediaPlayerMemento {
	private final String songName; // stare
	private final String timer; // stare
	
	
	public MediaPlayerMemento(String songName, String timer) {
		this.songName = songName;
		this.timer = timer;
	}
	
	
	public String getSongName() {
		return this.songName;
	}
	public String getTimer() {
		return this.timer;
	}
}

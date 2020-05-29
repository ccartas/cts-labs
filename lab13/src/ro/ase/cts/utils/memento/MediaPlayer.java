package ro.ase.cts.utils.memento;

// Originator
public class MediaPlayer {
	private String songName;
	private String timer;
	
	//creareMemento
	public MediaPlayerMemento exit() {
		System.out.println("Player is closing.");
		return new MediaPlayerMemento(this.songName, this.timer);
	}
	
	//setMemento
	public void start(MediaPlayerMemento memento) {
		if(memento != null) {
			this.songName = memento.getSongName();
			this.timer = memento.getTimer();
			System.out.println(String.format("Last played song %s at time %s", this.songName, this.timer));
		} else {
			System.out.println("Player started.");
		}
	}
	
	public String getSongName() {
		return this.songName;
	}
	public String getTimer() {
		return this.timer;
	}
	
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public void setTimer(String timer) {
		this.timer = timer;
	}
}
